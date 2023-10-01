package com.geekster.EcommerceApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderTable")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @ManyToOne
    @JoinColumn(name = "fk_UserId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "fk_ProductId")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "fk_AddressId")
    private Address address;
    private Integer productQuantity;
}
