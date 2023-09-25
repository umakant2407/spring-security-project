package com.example.springsecurityclient.dto.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;
}
