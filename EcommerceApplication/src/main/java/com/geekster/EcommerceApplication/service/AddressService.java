package com.geekster.EcommerceApplication.service;

import com.geekster.EcommerceApplication.model.Address;
import com.geekster.EcommerceApplication.model.User;
import com.geekster.EcommerceApplication.repo.IAddressRepo;
import com.geekster.EcommerceApplication.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IUserRepo userRepo;

    public String addAddress(Integer userId, Address newAddress) {
        User u1=userRepo.findById(userId).get();
        addressRepo.save(newAddress);
        return "Address added successfully";
    }
}
