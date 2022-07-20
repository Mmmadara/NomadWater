package com.example.demo.repositories;

import com.example.demo.entities.DictUrgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictUrgencyRepo extends JpaRepository<DictUrgency, Long> {
}
