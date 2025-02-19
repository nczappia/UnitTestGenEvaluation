MODEL_IDS=("Salesforce/codet5-base"  "Salesforce/codegen2-1B_P" "bigcode/starcoder2-3b"  "bigcode/santacoder")

#Currently using human eval x java dataset in the experiment
for MODEL_ID in "${MODEL_IDS[@]}"
do
    echo "Running experiment for model: $MODEL_ID"
    python3 experiment.py --model_id "$MODEL_ID" --batch_size 32 --hf_dataset_name "THUDM/humaneval-x" --hf_dataset_subset "java" --prompt_column "FILL IN"
done
