package com.geekster.EcommerceApplication.repo;

import com.geekster.EcommerceApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {
}
