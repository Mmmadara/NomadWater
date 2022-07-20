package com.example.demo.repositories;

import com.example.demo.entities.RouteSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteSheetRepo extends JpaRepository<RouteSheet, Long> {
}
