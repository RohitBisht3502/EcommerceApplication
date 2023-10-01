package com.geekster.EcommerceApplication.controller;

import com.geekster.EcommerceApplication.model.Address;
import com.geekster.EcommerceApplication.service.AddressService;
import com.geekster.EcommerceApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;


    @PostMapping("CREATE/ADDRESS/userId/{userId}")
    public String addAddress(@PathVariable Integer userId, @RequestBody Address newAddress){
        return addressService.addAddress(userId,newAddress);
    }

}
