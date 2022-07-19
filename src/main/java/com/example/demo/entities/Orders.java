package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    @ManyToOne()
    private Users authorId;
    private String comment;
    @ManyToOne()
    private Courier courier;
    private Boolean isSale;
    @ManyToOne()
    private OrderType orderTypeId;
    @ManyToOne()
    private PaymentMethod paymentMethodId;
    private String paymentUrl;
    private String phone;
    @ManyToOne()
    private DictOrderStatus statusId;
    private Double totalPrice;
    @ManyToOne()
    private DictUrgency urgencyId;
    @ManyToOne()
    private Users users;

    @ManyToMany()
    private List<RouteSheet> routeSheets; // не понял так ли :/

    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime changedDate;
    private LocalDateTime deliveryDate;
    private LocalDateTime orderDate;

    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDateTime.now();
    }

}
