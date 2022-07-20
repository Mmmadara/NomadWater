package com.example.demo.repositories;

import com.example.demo.entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepo extends JpaRepository<Form, Long> {
}
