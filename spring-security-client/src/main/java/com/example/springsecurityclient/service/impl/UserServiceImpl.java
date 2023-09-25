package com.example.springsecurityclient.service.impl;

import com.example.springsecurityclient.dto.UserRequestDTO;
import com.example.springsecurityclient.dto.UserResponseDTO;
import com.example.springsecurityclient.entity.User;
import com.example.springsecurityclient.errors.BadRequestException;
import com.example.springsecurityclient.mapper.UserMapper;
import com.example.springsecurityclient.repository.UserRepository;
import com.example.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  public UserResponseDTO register(UserRequestDTO requestDTO) throws BadRequestException {

    if (!requestDTO.getPassword().equals(requestDTO.getConfirmPassword())) {
      throw new BadRequestException("Confirm Password is not same as Password");
    }
    User user = userMapper.convertTO(requestDTO);
    // Add Role for user
    user.setRole("USER");
    // Encrypt password before saving
    user.setPassword(passwordEncoder.encode(user.getPassword()));

    return userMapper.convertTO(userRepository.save(user));
  }
}
