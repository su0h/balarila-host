from ninja import Schema

class PredictRequest(Schema):
  sentence: str
  
class PredictResponse(Schema):
  original: str
  corrected: str