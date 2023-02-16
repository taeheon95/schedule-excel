package com.example.schedule.user.model.dto;

import com.example.schedule.user.model.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private Long userNo;
    private String name;
    private String position;
    private String path;
    private Boolean is_deleted;

    public UserDTO(UserEntity user) {
        this.userNo = user.getUserNo();
        this.name = user.getName();
        this.position = user.getPosition().name();
        this.path = user.getPath();
    }
}
