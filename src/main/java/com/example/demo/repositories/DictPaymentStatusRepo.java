package com.example.demo.repositories;

import com.example.demo.entities.DictPaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictPaymentStatusRepo extends JpaRepository<DictPaymentStatus, Long> {
}
