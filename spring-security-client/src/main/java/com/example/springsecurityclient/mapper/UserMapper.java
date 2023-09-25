package com.example.springsecurityclient.mapper;

import com.example.springsecurityclient.dto.UserRequestDTO;
import com.example.springsecurityclient.dto.UserResponseDTO;
import com.example.springsecurityclient.dto.entity.UserDTO;
import com.example.springsecurityclient.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

  User convertTO(UserDTO userDTO);

  UserResponseDTO convertTO(User user);

  User convertTO(UserRequestDTO requestDTO);
}
