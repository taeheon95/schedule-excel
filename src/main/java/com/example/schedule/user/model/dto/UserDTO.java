package com.example.schedule.user.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long userNo;
    private String id;
    private String password;
    private String name;
    private String email;
}
