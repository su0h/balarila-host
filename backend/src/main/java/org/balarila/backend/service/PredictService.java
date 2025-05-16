package org.balarila.backend.service;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

import org.balarila.backend.dto.PredictRequest;
import org.balarila.backend.dto.PredictResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PredictService {

  @Value("${model.api.url}")
  private String modelAPIUrl;

  private final RestTemplate restTemplate = new RestTemplate();
  
  public PredictResponse predict(PredictRequest req) {
    PredictResponse res = null;

    try {
      // Generate JSON string
      ObjectMapper mapper = new ObjectMapper();
      String jsonString = mapper.writeValueAsString(req);

      // Send the request to the model API
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);

      HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);

      // Send POST request to model API and get the response
      ResponseEntity<PredictResponse> resEntity = restTemplate.postForEntity(modelAPIUrl, entity, PredictResponse.class);

      res = resEntity.getBody();
    } catch (Exception ex) {
      throw new RuntimeException(ex.getMessage());
    }

    return res;
  }

}
