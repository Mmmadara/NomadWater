package com.example.demo.repositories;

import com.example.demo.entities.ConfirmationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationCodeRepo extends JpaRepository<ConfirmationCode, Long> {
}
