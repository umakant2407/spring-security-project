package com.example.springsecurityclient.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class APIExceptionHandler {

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public ResponseEntity<ErrorResponseDTO> handleException(Exception exception) {
    return buildResponse(exception, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(HttpException.class)
  public ResponseEntity<ErrorResponseDTO> handleHttpException(HttpException exception){
    return buildResponse(exception, exception.getHttpStatus());
  }

  private ResponseEntity<ErrorResponseDTO> buildResponse(Exception exception, HttpStatus status) {
    ErrorResponseDTO errorResponse = new ErrorResponseDTO();
    errorResponse.setMessage(errorResponse.getMessage());
    errorResponse.setResponseStatus(status);

    return ResponseEntity.status(status).body(errorResponse);
  }
}
