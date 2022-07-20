package com.example.demo.repositories;

import com.example.demo.entities.DictBookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictBookingStatusRepo extends JpaRepository<DictBookingStatus, Long> {
}
