package com.example.schedule.user.service;

import com.example.schedule.user.model.dto.UserDTO;
import com.example.schedule.user.model.entity.UserEntity;
import com.example.schedule.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO user) {
        UserEntity userEntity = UserEntity.of(user);
        userRepository.saveAndFlush(userEntity);
        return userEntity.toDTO();
    }

    @Override
    public List<UserDTO> createUserList(List<UserDTO> userList) {
        List<UserEntity> userEntityList = userList.stream().map(UserEntity::of).toList();
        userRepository.saveAllAndFlush(userEntityList);
        return userEntityList.stream().map(UserEntity::toDTO).toList();
    }
}
