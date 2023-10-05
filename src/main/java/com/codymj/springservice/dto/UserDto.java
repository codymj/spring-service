package com.codymj.springservice.dto;

import com.codymj.springservice.entity.User;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private Long createdAt;
    private Long modifiedAt;

    public UserDto(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.createdAt = entity.getCreatedAt().getTime();
        this.modifiedAt = entity.getModifiedAt().getTime();
    }
}
