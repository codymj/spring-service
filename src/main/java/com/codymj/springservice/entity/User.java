package com.codymj.springservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull private String email;
    @NotNull private String password;
    @NotNull private String firstName;
    @NotNull private String lastName;
    @NotNull private Timestamp createdAt;
    @NotNull private Timestamp modifiedAt;
}
