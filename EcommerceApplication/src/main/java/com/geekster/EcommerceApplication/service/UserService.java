package com.geekster.EcommerceApplication.service;

import com.geekster.EcommerceApplication.model.User;
import com.geekster.EcommerceApplication.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    public String createUsers(List<User> newUser) {
        userRepo.saveAll(newUser);
        return "Users created Successfully";
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id).get();
    }
}
