package com.geekster.EcommerceApplication.repo;

import com.geekster.EcommerceApplication.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
