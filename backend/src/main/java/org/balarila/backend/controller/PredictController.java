package org.balarila.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.balarila.backend.dto.PredictRequest;
import org.balarila.backend.dto.PredictResponse;
import org.balarila.backend.service.PredictService;

@RestController
@RequestMapping("/predict")
public class PredictController {
  
  @Autowired
  private PredictService predictService;

  @PostMapping
  public PredictResponse predict (@RequestBody @Valid PredictRequest req) {
    return predictService.predict(req);
  }
  
}
