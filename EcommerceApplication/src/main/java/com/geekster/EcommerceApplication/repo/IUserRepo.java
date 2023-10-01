package com.geekster.EcommerceApplication.repo;

import com.geekster.EcommerceApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
