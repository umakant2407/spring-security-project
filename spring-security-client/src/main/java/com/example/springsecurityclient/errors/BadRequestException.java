package com.example.springsecurityclient.errors;

import org.springframework.http.HttpStatus;

public class BadRequestException extends HttpException {

  private static final long serialVersionUID = 7535620636104293234L;

  @Override
  public HttpStatus getHttpStatus() {
    return HttpStatus.BAD_REQUEST;
  }

  public BadRequestException() {}

  public BadRequestException(String message) {
    super(message);
  }

  public BadRequestException(String message, Throwable cause) {
    super(message, cause);
  }

  public BadRequestException(Throwable cause) {
    super(cause);
  }
}
