package com.geekster.EcommerceApplication.controller;

import com.geekster.EcommerceApplication.model.User;
import com.geekster.EcommerceApplication.service.AddressService;
import com.geekster.EcommerceApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("CREATE/USER")
    public String createUsers(@RequestBody List<User> newUser){
        return userService.createUsers(newUser);
    }

    @GetMapping("get/userId/{id}")
    public User getUserById(@PathVariable Integer id){
       return userService.getUserById(id);
    }
}
