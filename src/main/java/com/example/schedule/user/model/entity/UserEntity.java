package com.example.schedule.user.model.entity;

import com.example.schedule.user.enums.Position;
import com.example.schedule.user.model.dto.UserDTO;
import jakarta.persistence.*;
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
    private String name;
    @Enumerated(EnumType.STRING)
    private Position position;
    private String path;

    private UserEntity(String name, String position, String path) {
        this.name = name;
        this.position = Position.valueOf(position);
        this.path = path;
    }

    public static UserEntity of(String name, String position, String path){
        return new UserEntity(name, position, path);
    }

    public static UserEntity of(UserDTO user) {
        return new UserEntity(user.getName(), user.getPosition(), user.getPath());
    }

    public UserDTO toDTO() {
        return new UserDTO(this);
    }
}
