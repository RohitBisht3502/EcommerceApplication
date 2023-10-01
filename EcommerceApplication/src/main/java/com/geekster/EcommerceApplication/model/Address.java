package com.geekster.EcommerceApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String addressLandmark;
    private String addressPhoneNumber;
    private String addressZipCode;
    private String addressState;
    @ManyToOne
    @JoinColumn(name = "fk_UserId")
    private User user;
}
