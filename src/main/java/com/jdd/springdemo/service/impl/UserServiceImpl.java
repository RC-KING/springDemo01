package com.jdd.springdemo.service.impl;

import com.jdd.springdemo.domain.User;
import com.jdd.springdemo.mapper.UserMapper;
import com.jdd.springdemo.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() throws IOException {

        List<User> allUser = userMapper.getAllUser();
        return allUser;
    }

    @Override
    public void save(User user) throws IOException {


        userMapper.save(user);


    }
}
