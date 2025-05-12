package org.balarila.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PredictRequest {
  
  @NotBlank(message = "Sentence must not be blank")
  @Pattern(regexp=".*[a-zA-Z].*", message="Sentence must contain at least one letter")
  private String sentence;
  

  public String getSentence() {
    return sentence;
  }

  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

}
