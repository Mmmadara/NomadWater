package com.example.demo.services;

import com.example.demo.entities.ProductBooking;
import com.example.demo.repositories.ProductBookingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBookingService {

    private final ProductBookingRepo productBookingRepo;

    public ProductBookingService(ProductBookingRepo productBookingRepo) {
        this.productBookingRepo = productBookingRepo;
    }

    public ProductBooking createProductBooking(ProductBooking productBooking){
        return productBookingRepo.save(productBooking);
    }

    public ProductBooking updateProductBooking(String productBookingId, String name){
        ProductBooking toUpdateProductBooking = productBookingRepo.findById(Long.parseLong(productBookingId)).orElseThrow();
        toUpdateProductBooking.setName(name);

        return productBookingRepo.save(toUpdateProductBooking);
    }

    public void deleteProductBooking(String ProductBookingId){
        ProductBooking toDeleteProductBooking = productBookingRepo.findById(Long.parseLong(ProductBookingId)).orElseThrow();
        productBookingRepo.delete(toDeleteProductBooking);
    }

    public List<ProductBooking> getAllProductBookings(){
        return productBookingRepo.findAll();
    }
}
