package com.example.schedule.user.controller;

import com.example.schedule.common.util.ApiResponse;
import com.example.schedule.user.model.dto.UserDTO;
import com.example.schedule.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<UserDTO>> postUser(@RequestBody @Validated UserDTO user) throws URISyntaxException {

        UserDTO createdUser = userService.createUser(user);

        return ResponseEntity
                .created(new URI("user/" + createdUser.getUserNo()))
                .body(new ApiResponse<>(201, "create", createdUser));
    }

    @PostMapping("/insert-bulk")
    public ApiResponse<List<UserDTO>> postUserList(@RequestBody List<UserDTO> userList) {
        List<UserDTO> savedUserList = userService.createUserList(userList);
        return new ApiResponse<>(201, "create", savedUserList);
    }
}
