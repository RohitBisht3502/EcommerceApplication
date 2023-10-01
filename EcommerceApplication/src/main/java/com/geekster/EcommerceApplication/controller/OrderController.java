package com.geekster.EcommerceApplication.controller;

import com.geekster.EcommerceApplication.model.Order;
import com.geekster.EcommerceApplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("add order")
    public String addOrder(@RequestBody Order order){
       return orderService.addOrder(order);
    }

    @GetMapping("getBy/Order/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

}
