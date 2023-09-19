package com.example.springsecurityclient.service.impl;

import com.example.springsecurityclient.dto.UserRequestDTO;
import com.example.springsecurityclient.dto.UserResponseDTO;
import com.example.springsecurityclient.repository.UserRepository;
import com.example.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserResponseDTO register(UserRequestDTO requestDTO) {

    return null;
  }
}
