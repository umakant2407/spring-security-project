package com.example.springsecurityclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
public class ResponseDTO<T> {

  private T data;

  private Date timestamp = new Date();

  private Metadata metadata;

  public ResponseDTO(T data) {
    this.data = data;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public class Metadata {

    private Integer count;

  }
}
