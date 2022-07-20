package com.example.demo.repositories;

import com.example.demo.entities.WarehouseWorkers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseWorkersRepo extends JpaRepository<WarehouseWorkers, Long> {
}
