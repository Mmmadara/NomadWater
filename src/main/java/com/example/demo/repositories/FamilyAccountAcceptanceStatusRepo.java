package com.example.demo.repositories;

import com.example.demo.entities.FamilyAccountAcceptanceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyAccountAcceptanceStatusRepo extends JpaRepository<FamilyAccountAcceptanceStatus, Long> {
}
