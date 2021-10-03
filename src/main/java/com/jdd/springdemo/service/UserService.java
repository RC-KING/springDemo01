package com.jdd.springdemo.service;

import com.jdd.springdemo.domain.User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


public interface UserService {
    List<User> getUserList() throws IOException;

    void save(User user) throws IOException;
}
