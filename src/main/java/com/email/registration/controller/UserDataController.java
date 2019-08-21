package com.email.registration.controller;

import com.email.registration.domain.User;
import com.email.registration.dto.UserDto;
import com.email.registration.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class UserDataController {

    @Autowired
    UserDataService userDataService;

        @RequestMapping(value = "/user", method = RequestMethod.POST)
        public ResponseEntity<UserDto> addNewUser ( @RequestBody  UserDto newUser) {

        return new ResponseEntity<>(userDataService.addUser(newUser), HttpStatus.OK);
        }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<UserDto>> getSchemas() {
        return new ResponseEntity<>(userDataService.getUsers(), HttpStatus.OK);
    }


}