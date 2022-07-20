package com.example.demo.services;

import com.example.demo.entities.CourierBalance;
import com.example.demo.repositories.CourierBalanceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierBalanceService {
    private final CourierBalanceRepo courierBalanceRepo;

    public CourierBalanceService(CourierBalanceRepo CourierBalanceRepo) {
        this.courierBalanceRepo = CourierBalanceRepo;
    }

    public CourierBalance createCourierBalance(CourierBalance courierBalance){
        return courierBalanceRepo.save(courierBalance);
    }

    public CourierBalance updateCourierBalance(String courierBalanceId, Long quantity){
        CourierBalance toUpdateCourierBalance = courierBalanceRepo.findById(Long.parseLong(courierBalanceId)).orElseThrow();
        toUpdateCourierBalance.setQuantity(quantity);

        return courierBalanceRepo.save(toUpdateCourierBalance);
    }

    public void deleteCourierBalance(String courierBalanceId){
        CourierBalance toDeleteCourierBalance = courierBalanceRepo.findById(Long.parseLong(courierBalanceId)).orElseThrow();
        courierBalanceRepo.delete(toDeleteCourierBalance);
    }

    public List<CourierBalance> getAllCourierBalances(){
        return courierBalanceRepo.findAll();
    }
}
