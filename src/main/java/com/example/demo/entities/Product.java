package com.example.demo.entities;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private Double productPrice;
    private String description; // text?>
    @Type(type="org.hibernate.type.BinaryType")
    @Column(columnDefinition = "BYTEA")
    private byte[] imageByte;
    private Double urgencyPrice;
    @ManyToOne()
    private ProductCategory productCategory;
    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDateTime.now();
    }

}
