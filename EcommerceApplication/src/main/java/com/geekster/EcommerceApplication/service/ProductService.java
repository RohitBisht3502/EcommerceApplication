package com.geekster.EcommerceApplication.service;

import com.geekster.EcommerceApplication.model.Product;
import com.geekster.EcommerceApplication.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public String createProducts(List<Product> newProduct) {
        productRepo.saveAll(newProduct);
        return "Products are added Successfully";
    }

    public List<Product> getAllProduct() {
        return (List<Product>) productRepo.findAll();
    }


    public String deleteProductById(Integer id) {
        productRepo.deleteById(id);
        return "product deleted successfully";
    }
}
