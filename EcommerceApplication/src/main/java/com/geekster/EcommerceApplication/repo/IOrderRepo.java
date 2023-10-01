package com.geekster.EcommerceApplication.repo;

import com.geekster.EcommerceApplication.model.Address;
import com.geekster.EcommerceApplication.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
