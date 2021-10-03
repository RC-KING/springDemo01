package com.jdd.springdemo.controller;

import com.jdd.springdemo.domain.User;
import com.jdd.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userList")
    public String userList(Model model) throws IOException {
        List<User> userList =userService.getUserList();
        model.addAttribute("userList",userList);
        return "userlist";
    }

    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(User user) throws IOException {
        userService.save(user);
        return "恭喜你保存成功!";
    }
}
