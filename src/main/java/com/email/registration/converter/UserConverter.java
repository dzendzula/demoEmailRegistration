package com.email.registration.converter;

import com.email.registration.domain.User;
import com.email.registration.dto.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<User, UserDto> {
    @Override
    public UserDto convert(User user) {
        if (user == null) {
            return null;
        }
        UserDto result = new UserDto();
        result.setId(user.getId());
        result.setLogin(user.getLogin());
        result.setEmail(user.getEmail());
        return result;
    }
}
