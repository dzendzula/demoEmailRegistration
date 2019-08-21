package com.email.registration.service.impl;


import com.email.registration.domain.User;
import com.email.registration.dto.UserDto;
import com.email.registration.repository.UserRepository;
import com.email.registration.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class UserDataServiceImpl implements UserDataService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto newUser) {
        User n = new User();
        n.setLogin(newUser.getLogin());
        n.setEmail(newUser.getEmail());
        User savedUser = userRepository.save(n);

        return new UserDto(savedUser.getId(),savedUser.getLogin(),savedUser.getEmail());
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> all = userRepository.findAll();
        List<UserDto> result = all.stream().map(c -> new UserDto(c.getId(),c.getLogin(),c.getEmail())).collect(Collectors.toList());
        return result;
    }
}
