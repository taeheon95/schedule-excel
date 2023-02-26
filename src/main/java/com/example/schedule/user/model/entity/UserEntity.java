package com.example.schedule.user.model.entity;

import com.example.schedule.user.model.dto.CreateUserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "t_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserEntity {
    @Id
    @GeneratedValue
    private Long userNo;
    private String id;
    private String password;
    private String name;
    private String email;

    private UserEntity(String id, String password, String name, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public static UserEntity of(CreateUserDTO userDTO) {
        return new UserEntity(
                userDTO.getId(),
                userDTO.getPassword(),
                userDTO.getName(),
                userDTO.getEmail()
        );
    }
}
