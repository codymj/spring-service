package com.codymj.springservice.service;

import com.codymj.springservice.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getUsers();
}
