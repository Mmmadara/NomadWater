package com.example.demo.repositories;

import com.example.demo.entities.OrderBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderBalanceRepo extends JpaRepository<OrderBalance, Long> {
}
