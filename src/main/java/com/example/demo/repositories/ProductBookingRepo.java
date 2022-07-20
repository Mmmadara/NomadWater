package com.example.demo.repositories;

import com.example.demo.entities.ProductBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBookingRepo extends JpaRepository<ProductBooking, Long> {
}
