package com.codymj.springservice.service;

import com.codymj.springservice.dto.UserDto;
import com.codymj.springservice.entity.User;
import com.codymj.springservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepo;

    @Autowired
    public UserServiceImpl(UserRepository ur) {
        this.userRepo = ur;
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> entities = (List<User>)userRepo.findAll();

        List<UserDto> dtos = new ArrayList<>();
        for (User u : entities) {
            dtos.add(new UserDto(u));
        }

        return dtos;
    }
}
