package pl.halczak.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter <String, User> {

    @Autowired
    private UserService userService;

    @Override
    public User convert(String s) {return userService.findById(Long.parseLong(s)); }
}
