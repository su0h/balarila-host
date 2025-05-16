FROM python:3.7-slim

# RUN apt-get update && \
#   apt-get install -y wget && \
#   apt-get clean && \
#   rm -rf /var/lib/apt/lists/*

WORKDIR /balarila

COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

COPY . .

# TODO: If possible, add command to download Balarila model to be stored in the model folder
# RUN wget -O model/model.th https://huggingface.co/spaces/Balarila/balarila-demo/blob/main/models/output_models/roberta_tagalog_large_stage_3/best.th

EXPOSE 8000