package com.dave.cloud.service.impl;

import com.dave.cloud.VO.User;
import com.dave.cloud.repository.UserRepository;
import com.dave.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }
}
