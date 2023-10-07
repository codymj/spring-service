package com.codymj.springservice.service;

import com.codymj.springservice.dto.UserDto;
import com.codymj.springservice.entity.User;
import com.codymj.springservice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSvcImpl implements UserSvc {
    private final UserRepo userRepo;

    @Autowired
    public UserSvcImpl(UserRepo ur) {
        this.userRepo = ur;
    }

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> dtos = new ArrayList<>();

        List<User> entities = (List<User>)userRepo.findAll();
        for (User u : entities) {
            dtos.add(new UserDto(u));
        }

        return dtos;
    }
}
