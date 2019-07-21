package com.dave.cloud.controller;

import com.dave.cloud.VO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/movie/{id}",method = RequestMethod.GET)
    public Object getUser(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://localhost:8082/micro_user/user/"+id, User.class);
    }
}
