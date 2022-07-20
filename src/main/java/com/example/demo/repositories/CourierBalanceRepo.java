package com.example.demo.repositories;

import com.example.demo.entities.CourierBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierBalanceRepo extends JpaRepository<CourierBalance, Long> {
}
