package com.example.springsecurityclient.service;

import com.example.springsecurityclient.dto.UserRequestDTO;
import com.example.springsecurityclient.dto.UserResponseDTO;
import com.example.springsecurityclient.errors.BadRequestException;

public interface UserService {
  UserResponseDTO register(UserRequestDTO requestDTO) throws BadRequestException;
}
