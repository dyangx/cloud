package com.dave.cloud.controller;

import com.dave.cloud.VO.User;
import com.dave.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Object hello(){
        return "12356";
    }

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public Object getUser(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        System.out.println(user);
        return user;
    }
}
