package com.example.demo.repositories;

import com.example.demo.entities.DictOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictOrderStatusRepo extends JpaRepository<DictOrderStatus, Long> {
}
