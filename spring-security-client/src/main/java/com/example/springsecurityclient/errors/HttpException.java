package com.example.springsecurityclient.errors;

import org.springframework.http.HttpStatus;

public abstract class HttpException extends Exception {

  private static final long serialVersionUID = -388796344494464495L;

  public abstract HttpStatus getHttpStatus();

  public HttpException() {
  }

  public HttpException(String message) {
    super(message);
  }

  public HttpException(String message, Throwable cause) {
    super(message, cause);
  }

  public HttpException(Throwable cause) {
    super(cause);
  }
}
