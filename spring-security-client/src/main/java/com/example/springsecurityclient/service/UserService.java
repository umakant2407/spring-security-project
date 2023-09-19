package com.example.springsecurityclient.service;

import com.example.springsecurityclient.dto.UserRequestDTO;
import com.example.springsecurityclient.dto.UserResponseDTO;

public interface UserService {
  UserResponseDTO register(UserRequestDTO requestDTO);
}
