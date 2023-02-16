package com.example.schedule.user.service;

import com.example.schedule.common.util.ApiResponse;
import com.example.schedule.user.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);

    List<UserDTO> createUserList(List<UserDTO> userList);
}
