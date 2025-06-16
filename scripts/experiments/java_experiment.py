import argparse
import json
import logging
import os
import pandas as pd
import time
import torch


from transformers import AutoTokenizer, AutoModelForCausalLM, AutoModelForSeq2SeqLM
from datasets import Dataset, load_dataset



def get_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("--model_id", type=str, default="deepseek-ai/deepseek-coder-6.7b-instruct")
    parser.add_argument("--dataset_location", type=str, default = "../../data/prompts/shuffled_prompts.csv")
    parser.add_argument("--prompt_column", type=str, default = "prompt")
    #parser.add_argument("--batch_size", type=int, default = 16)
    parser.add_argument("--prompt_output_dir", type=str, default="../../data/results")
    parser.add_argument("--max_new_tokens", type=int, default = 300)
    parser.add_argument("--device", type = str, default="cpu")
    return parser.parse_args()

def save_responses(df):
    return 0


def main(args):

    print("Loading Tokenizer")
    tokenizer = AutoTokenizer.from_pretrained(args.model_id)

    print("Loading Model")
    if (args.model_id.split('/')[0] == "Salesforce"):
        print("Seq2Seq Model")
        model = AutoModelForSeq2SeqLM.from_pretrained(
            args.model_id,
            trust_remote_code=True,
            low_cpu_mem_usage=True,
        ).to(args.device)
    else:
        print("CausalLM Model")
        if(args.model_id == "deepseek-ai/DeepSeek-Coder-V2-Lite-Base"):

            print("Quantizing Model to 8 bits")
            from transformers import BitsAndBytesConfig
            bnb_config = BitsAndBytesConfig(load_in_8bit=True)

            model = AutoModelForCausalLM.from_pretrained("deepseek-ai/DeepSeek-Coder-V2-Lite-Base", 
                trust_remote_code=True,
                quantization_config = bnb_config
            )  

        else: 
            model = AutoModelForCausalLM.from_pretrained(
                args.model_id,
                trust_remote_code=True,
                low_cpu_mem_usage=True,
            ).to(args.device)

    #model.to(args.device)
    
    #Load hf-hosted dataset
    df = pd.read_csv(args.dataset_location)
    
    start_time = time.time()

    responses = []

    from transformers import GenerationConfig
    gen_config = GenerationConfig(max_new_tokens = 300)

    for i, row in enumerate(df.iterrows()):
        formatted_prompt = row[1].iloc[1]
        inputs = tokenizer.encode(formatted_prompt, return_tensors="pt").to(args.device) 
        outputs = model.generate(inputs, gen_config)
        response = tokenizer.decode(outputs[0], skip_special_tokens=True)
        responses.append(response)
        print(f"Done with Example {i}")

    # End timing
    end_time = time.time()
    total_time = end_time - start_time

    model_name = args.model_id.split('/')[1]

    dataset_name = args.dataset_location.split('/')[-1][:-4] #Trims .csv

    response_dir = f"{args.prompt_output_dir}/{model_name}__{dataset_name}"

    os.mkdir(response_dir)

    output_file = f"{response_dir}/responses.csv"

    df = pd.DataFrame(responses)
    df.to_csv(output_file, index=False)

    # Save timing info
    with open(args.prompt_output_dir + "timing.txt", "a") as f:
        f.write(f"Total generation time (seconds) for {model_name} on dataset {dataset_name}: {total_time}\n")

    #Save responses
    print(f"Saved responses to {output_file}.")

    #Save model generation values
    gen_config = model.generation_config
    config_dict = gen_config.to_dict()

    with open(f"{response_dir}/generation_config.json", "w") as f:
        json.dump(config_dict, f, indent=4)

    #Finish timing
    print(f"Total time: {total_time:.2f} seconds")

if __name__ == "__main__":
    print("Here we go!")
    args = get_args()

    main(args)