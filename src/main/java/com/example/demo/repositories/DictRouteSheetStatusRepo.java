package com.example.demo.repositories;

import com.example.demo.entities.DictRouteSheetStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictRouteSheetStatusRepo extends JpaRepository<DictRouteSheetStatus, Long> {
}
