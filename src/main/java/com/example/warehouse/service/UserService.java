package com.example.warehouse.service;

import com.example.warehouse.dto.UserDto;
import com.example.warehouse.entity.User;

public interface UserService {
    User save(UserDto userDto);
}
