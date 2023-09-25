package com.example.springsecurityclient.errors;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponseDTO {

  /**
   * Response status code.
   */
  private HttpStatus responseStatus;

  /**
   * Response error message.
   */
  private String message;
}
