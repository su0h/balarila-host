from ninja import NinjaAPI, Body
from . import views
from .schemas import PredictRequest, PredictResponse

api = NinjaAPI()

@api.post("/predict", response=PredictResponse)
def predict(request, data: PredictRequest):
  return views.predict_view(request, data)
