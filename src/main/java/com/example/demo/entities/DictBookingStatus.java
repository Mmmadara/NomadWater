package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DictBookingStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusName;
}
