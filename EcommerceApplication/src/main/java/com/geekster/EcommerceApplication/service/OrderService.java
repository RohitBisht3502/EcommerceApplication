package com.geekster.EcommerceApplication.service;

import com.geekster.EcommerceApplication.model.Order;
import com.geekster.EcommerceApplication.repo.IOrderRepo;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public String addOrder(Order order) {
        orderRepo.save(order);
        return "order placed successfully";
    }

    public Order getOrderById(Integer id) {
        return orderRepo.findById(id).get();
    }
}
