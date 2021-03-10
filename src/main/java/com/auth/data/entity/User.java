package com.auth.data.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author Abdur Rahim Nishad
 * @created 23/02/2021 - 12:38 AM
 * @project authmodule
 */
@Data
@Entity
@Table(name = "user_tbl")
public class User {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    public String id;
    @Column(nullable = false)
    @NotNull
    public String username;
    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    public String email;
    @Column(nullable = false)
    public String password;
    @Column(nullable = false)
    public String firstName;
    @Column(nullable = false)
    public String lastName;
    private String emailVerificationToken;
    @Column(nullable = false)
    private Boolean emailVerificationStatus = false;
    @Column(nullable = false)
    private boolean isActive = true;
}
