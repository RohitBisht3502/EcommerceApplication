package com.geekster.EcommerceApplication.controller;

import com.geekster.EcommerceApplication.model.Product;
import com.geekster.EcommerceApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("create/Product")
    public String createProducts(@RequestBody List<Product> newProduct){
        return productService.createProducts(newProduct);
    }

    @GetMapping("GET/ALL/Product/")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @DeleteMapping("DELETE/PRODUCT/ID/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }
}
