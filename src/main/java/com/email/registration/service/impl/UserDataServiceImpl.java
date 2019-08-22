package com.email.registration.service.impl;


import com.email.registration.converter.UserConverter;
import com.email.registration.domain.User;
import com.email.registration.dto.UserDto;
import com.email.registration.repository.UserRepository;
import com.email.registration.service.UserDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDataServiceImpl implements UserDataService{

    Logger logger = LoggerFactory.getLogger(UserDataServiceImpl.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDto addUser(UserDto userDto) {
        if (userDto == null) {
            throw new IllegalArgumentException("Trying to create user with null value");
        }
        List<User> existingUsers = userRepository.findByLoginOrEmail(userDto.getLogin(), userDto.getEmail());
        if (!CollectionUtils.isEmpty(existingUsers)) {
            throw new IllegalArgumentException("User with this email or login already exists.");
        }
        User user = new User();
        user.setLogin(userDto.getLogin());
        user.setEmail(userDto.getEmail());

        return userConverter.convert(userRepository.save(user));
    }

    @Override
    public List<UserDto> getUsers() {
        return userRepository.findAll().stream().map(userConverter::convert).collect(Collectors.toList());
    }
}
