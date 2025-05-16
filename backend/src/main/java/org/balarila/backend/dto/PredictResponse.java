package org.balarila.backend.dto;

public class PredictResponse {
  
  private String original;
  private String corrected;

  public String getCorrected() {
    return corrected;
  }

  public String getOriginal() {
    return original;
  }

  public void setCorrected(String corrected) {
    this.corrected = corrected;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

}
