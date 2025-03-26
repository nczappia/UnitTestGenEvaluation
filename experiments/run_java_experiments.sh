# MODEL_IDS=("bigcode/starcoder2-3b")
# #SUBSETS=("cpp", "go", "java", "js", "python")
# DATSET_LOCATIONS=(
#     "/media/mujtaba/DATA/nick/UnitTestExamples/data/prompts/humanevalx/few_shot_first_prompts.csv" 
#     "/media/mujtaba/DATA/nick/UnitTestExamples/data/prompts/humanevalx/zero_shot_first_prompts.csv"
# )

# #Currently using human eval x java dataset in the experiment
# for MODEL_ID in "${MODEL_IDS[@]}"; do
#     echo "Starting with starcoder2-3b!"
#     for DATASET_LOCATION in "${DATASET_LOCATIONS[@]}"; do
#         echo "Running experiment for model: $MODEL_ID with dataset: $DATASET_LOCATION"
#         python3 java_experiment.py \
#             --model_id "$MODEL_ID" \
#             --prompt_column "prompt" \
#             --dataset_location "$DATASET_LOCATION" \
#             --max_new_tokens 300 \
#             --prompt_output_dir "/media/mujtaba/DATA/nick/UnitTestExamples/data/results" \
#             --device "cuda:0"
#     done
# done

MODEL_IDS=("bigcode/starcoder2-3b")
DATASET_LOCATIONS=(
  #"/media/mujtaba/DATA/nick/UnitTestExamples/data/prompts/humanevalx/few_shot_first_prompts.csv"
  "/media/mujtaba/DATA/nick/UnitTestExamples/data/prompts/humanevalx/zero_shot_first_prompts.csv"
)

for MODEL_ID in "${MODEL_IDS[@]}"; do
    echo "Outer loop: MODEL_ID=$MODEL_ID"
    
    for DATASET_LOCATION in "${DATASET_LOCATIONS[@]}"; do
        echo "Inner loop: DATASET_LOCATION=$DATASET_LOCATION"
        
        python3 java_experiment.py \
            --model_id "$MODEL_ID" \
            --prompt_column "prompt" \
            --dataset_location "$DATASET_LOCATION" \
            --max_new_tokens 300 \
            --prompt_output_dir "/media/mujtaba/DATA/nick/UnitTestExamples/data/results" \
            --device "cuda:0"
    done
done