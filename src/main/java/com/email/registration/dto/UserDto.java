package com.email.registration.dto;


import com.email.registration.utils.Constants;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;


public class UserDto implements Serializable {

    private Long id;
    @NotBlank
    private String login;
    @NotBlank
    @Pattern(regexp = Constants.EMAIL_PATTERN)
    private String email;

    public UserDto() {
    }

    public UserDto(Long id, String login, String email) {
        this.id = id;
        this.login = login;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
