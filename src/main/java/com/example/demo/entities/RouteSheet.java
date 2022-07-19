package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class RouteSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne()
    private Courier courier; // courier id & name?
    @ManyToOne()
    private DictOrderStatus statusId;

    @ManyToMany(mappedBy = "routeSheets")
    private List<Orders> orders;

    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime EndingTime;

    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDateTime.now();
    }

}
