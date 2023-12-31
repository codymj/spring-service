package com.codymj.springservice.api;

import com.codymj.springservice.dto.UserDto;
import com.codymj.springservice.service.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {
    private final UserSvc userSvc;

    @Autowired
    public UserApi(UserSvc userSvc) {
        this.userSvc = userSvc;
    }

    @GetMapping(value={"", "/"}, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDto>> getUsers() {
        List<UserDto> users = userSvc.getUsers();
        if (users==null || users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
