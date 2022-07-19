package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Users {

    //депозитов несколько у каждого человека или один
    //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addressComment;
    private String birthday;
    private Long bonuses;
    private String firstname;
    private String flat;
    private String houseNumber;
    private String lastname;
    private String middleName;
    @Column(length = 3000)
    private String password;
    private String phone;
    private String role;
    private String street;
    private String telegramAccount;

    @OneToMany()
    private List<Deposit> deposits;

    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime updatedTime;

    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDateTime.now();
    }

}
