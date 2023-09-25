package com.example.springsecurityclient.controller;

import com.example.springsecurityclient.dto.ResponseDTO;
import com.example.springsecurityclient.dto.UserRequestDTO;
import com.example.springsecurityclient.dto.UserResponseDTO;
import com.example.springsecurityclient.errors.BadRequestException;
import com.example.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/register")
public class RegistrationController {

  @Autowired
  private UserService userService;

  @PostMapping("user")
  ResponseDTO<UserResponseDTO> registerUser(@RequestBody UserRequestDTO requestDTO) throws BadRequestException {
    UserResponseDTO user = userService.register(requestDTO);

    return new ResponseDTO<>(user);
  }
}
