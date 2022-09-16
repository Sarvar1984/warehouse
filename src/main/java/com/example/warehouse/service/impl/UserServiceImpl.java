package com.example.warehouse.service.impl;

import com.example.warehouse.dto.UserDto;
import com.example.warehouse.entity.User;
import com.example.warehouse.repository.UserRepository;
import com.example.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user=new User(
                userDto.getName(),
                userDto.getFirstName(),
                userDto.getPhoneNumber(),
                userDto.getPassword(),
                userDto.getWarehouse(),
                userDto.getStatus()
        );
        return userRepository.save(user);
    }
}
