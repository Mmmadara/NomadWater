package com.example.demo.repositories;

import com.example.demo.entities.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTypeRepo extends JpaRepository<OrderType, Long> {
}
