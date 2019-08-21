package com.email.registration.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;


public class UserDto implements Serializable {


    private Long id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String login;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
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
