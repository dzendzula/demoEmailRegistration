package com.email.registration.service;

import com.email.registration.domain.User;
import com.email.registration.dto.UserDto;

import java.util.List;

/**
 * Created by user on 20.08.2019.
 */
public interface UserDataService {
    UserDto addUser(UserDto user);
    List<UserDto> getUsers();
}
