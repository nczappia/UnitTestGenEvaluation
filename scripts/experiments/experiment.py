import argparse
import logging
import os
import pandas as pd
import time
import torch


from transformers import BitsAndBytesConfig, AutoTokenizer, AutoModelForCausalLM, AutoModelForSeq2SeqLM, pipeline
from datasets import Dataset, load_dataset



def get_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("--model_id", type=str, default="deepseek-ai/deepseek-coder-6.7b-instruct")
    parser.add_argument("--dataset_location", type=str, default = "../../data/prompts/shuffled_prompts.csv")
    parser.add_argument("--hf_dataset_name", type=str, default = None)
    parser.add_argument("--hf_dataset_subset", type=str, default=None)
    parser.add_argument("--prompt_column", type=str, default = "prompt")
    parser.add_argument("--batch_size", type=int, default = 16)
    parser.add_argument("--prompt_output_dir", type=str, default="../../data/results")
    parser.add_argument("--max_length", type=int, default = 1000)
    return parser.parse_args()

def save_responses(df):
    return 0


def main(args):
    # print("Creatign BAB config")
    # # config
    # bnb_config = BitsAndBytesConfig(
    #     load_in_4bit=True,
    #     bnb_4bit_quant_type="nf4",
    #     bnb_4bit_compute_dtype=torch.bfloat16,
    # )

    print("Loading Tokenizer")
    tokenizer = AutoTokenizer.from_pretrained(args.model_id)

    print("Loading Model")
    if (args.model_id == "Salesforce/codet5-base"):
        print("Seq2Seq Model")
        model = AutoModelForSeq2SeqLM.from_pretrained(
            args.model_id,
            #quantization_config=bnb_config,
            trust_remote_code=True,
            low_cpu_mem_usage=True,
        )
    else:
        print("CausalLM Model")
        model = AutoModelForCausalLM.from_pretrained(
            args.model_id,
            #quantization_config=bnb_config,
            trust_remote_code=True,
            low_cpu_mem_usage=True,
        )

    print("Creating Pipeline")
    if (args.model_id == "Salesforce/codet5-base"):
        text_generator = pipeline(
            "text2text-generation",
            model=model,
            tokenizer=tokenizer  
        )
    else:
        text_generator = pipeline(
            "text-generation",
            model=model,
            tokenizer=tokenizer
        )
    
    #Load hf-hosted dataset
    if(args.hf_dataset_name is not None):
        if(args.hf_dataset_subset is not None):
            ds = load_dataset(args.hf_dataset_name, args.hf_dataset_subset)
        else:
            ds = load_dataset(args.hf_dataset_name)
    else:
        ds = Dataset.from_csv(args.dataset_location)
    
    start_time = time.time()

    def generate_text(batch, text_generator=None):
        prompts = batch["prompt"]
        outputs = text_generator(batch["prompt"])
        # If the pipeline returns a list of dict, handle that
        generated_texts = [o[0]["generated_text"] for o in outputs]
        return {"generated_text": generated_texts}

    generated_dataset = ds.map(generate_text, 
                                    fn_kwargs= {"text_generator": text_generator}, 
                                    desc="Processing dataset", 
                                    batched=True, 
                                    batch_size=args.batch_size,
                                    #num_proc=4,
    )

    # End timing
    end_time = time.time()
    total_time = end_time - start_time

    model_name = args.model_id.split('/')[1]

    response_dir = f"{args.prompt_output_dir}/{model_name}"

    os.mkdir(response_dir)

    output_file = f"{response_dir}/responses.csv"

    df = generated_dataset.to_pandas()
    df.to_csv(output_file, index=False)

    # Save timing info
    with open(args.prompt_output_dir + "timing.txt", "a") as f:
        f.write(f"Total generation time (seconds) for {args.model_id}: {total_time}\n")

    #Save responses
    print(f"Saved responses to {output_file}.")

    #Finish timing
    print(f"Total time: {total_time:.2f} seconds")

if __name__ == "__main__":
    args = get_args()

    main(args)
