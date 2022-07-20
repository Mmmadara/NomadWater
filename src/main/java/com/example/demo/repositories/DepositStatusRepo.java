package com.example.demo.repositories;

import com.example.demo.entities.DepositStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositStatusRepo extends JpaRepository<DepositStatus, Long> {
}
