package com.example.demo.repositories;

import com.example.demo.entities.WarehouseBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseBalanceRepo extends JpaRepository<WarehouseBalance, Long> {
}
