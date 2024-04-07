package com.project.ldapauth.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginForm {
    private String password;
    private String username; //uid
}
