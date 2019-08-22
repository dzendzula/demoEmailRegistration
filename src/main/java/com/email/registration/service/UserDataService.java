package com.email.registration.service;

import com.email.registration.dto.UserDto;

import java.util.List;

/**
 * Service interface for operation with users
 * Created by user on 20.08.2019.
 */
public interface UserDataService {

    /**
     * Creates a new user record
     *
     * @param user @{@link UserDto} object
     * @return saved user object with database ID.
     */
    UserDto addUser(UserDto user);

    /**
     * Returns list of all known users
     *
     * @return List of @{@link UserDto} objects
     */
    List<UserDto> getUsers();
}
