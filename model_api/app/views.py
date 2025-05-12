from django.http import JsonResponse
from .schemas import PredictResponse

def predict_view(request, data):
  # TODO: Replace with data.sentence
  original = "siya ay punta sa mall"
  # TODO: Replace with actual model inference
  corrected = "Siya ay pumunta sa mall."
  
  response = PredictResponse(original=original, corrected=corrected)
  
  return response