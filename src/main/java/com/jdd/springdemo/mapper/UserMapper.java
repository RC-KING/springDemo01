package com.jdd.springdemo.mapper;

import com.jdd.springdemo.domain.User;


import java.util.List;

public interface UserMapper {
    List<User> getAllUser();

    void save(User user);
}
