package com.example.demo.repositories;

import com.example.demo.entities.FamilyAccountRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyAccountRequestRepo extends JpaRepository<FamilyAccountRequest, Long> {
}
