package com.me.smarttaskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.me.smarttaskmanager.model.UserModel;
import com.me.smarttaskmanager.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserModel registerUser(UserModel user) {
        System.out.println(userRepo.save(user));
        return user;
    }

}
