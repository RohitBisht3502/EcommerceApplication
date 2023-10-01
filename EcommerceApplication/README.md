# <h1 align = "center">  Ecommerce API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The  Ecommerce Application is a Spring Boot-based web application designed to help manage user,products,order information. It allows users to perform various operations related to  Ecommerce management, including adding new users and products, updating specialties, and deleting events from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **User Controller** `CREATE /Users` and GET/Users`
   
   This endpoint creare user and get user by using user id.

   ```java
    Creating user
    @PostMapping("CREATE/USER")
    public String createUsers(@RequestBody List<User> newUser){
    }

    Getting all user by user id
    @GetMapping("get/userId/{id}")
    public User getUserById(@PathVariable Integer id){
    }
   ```

2. **Product Controller:** 

   This endpoint create a product and get all product and delete product such type of operation is in this.

   ```java
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
   ```

3. **Order Controller:** 

   This endpoint we have api to placed the order and fetch the details of order by using order id.

   ```java
   @PostMapping("add order")
    public String addOrder(@RequestBody Order order){
       return orderService.addOrder(order);
    }

    @GetMapping("getBy/Order/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
   ```

4. **Address Controller:** 

   This controller have end point to create address base on user id to the system.

   ```java
     @PostMapping("CREATE/ADDRESS/userId/{userId}")
    public String addAddress(@PathVariable Integer userId, @RequestBody Address newAddress){
        return addressService.addAddress(userId,newAddress);
    }
   ```


The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for Ecommerce management, with fields such as:

## Database Used

The project utilizes the following data structures:

### Model
1.User
2.Product
3.Address
4.Order

### MySql

The project

 utilizes the `MySql` data structure to store and manage lists of `Ecommerce ` objects in various parts of the application. `MySql` provides permanent storage and efficient element retrieval, making it suitable for storing university records and performing operations on them.

These database enable the application to organize and manipulate Ecommerce  data efficiently while maintaining data integrity.

## Project Summary

The  Ecommerce API Application is a robust Spring Boot application designed for efficient  Ecommerce data management. It offers a set of RESTful API endpoints for various restaurant-related operations, including adding, retrieving, updating, and deleting restaurant information.

Key Features:

- RESTful API endpoints for restaurant management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture (Controller, Services, Repository).
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The Ecommerce  Management Application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and Ecommerce  data management. It offers a solid foundation for building and extending Ecommerce  management systems in various applications.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [ROHIT SINGH BISHT](mailto:business.rohitbisht3502@gmail.com)


