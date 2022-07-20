package com.example.demo.services;

import com.example.demo.entities.Courier;
import com.example.demo.repositories.CourierRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {

    private final CourierRepo courierRepo;

    public CourierService(CourierRepo courierRepo) {
        this.courierRepo = courierRepo;
    }

    public Courier createCourier(Courier courier){
        return courierRepo.save(courier);
    }

    public Courier updateCourierCar(String courierId, String car){
        Courier toUpdateCourier = courierRepo.findById(Long.parseLong(courierId)).orElseThrow();
        toUpdateCourier.setCar(car);

        return courierRepo.save(toUpdateCourier);
    }

    public void deleteCourier(String CourierId){
        Courier toDeleteCourier = courierRepo.findById(Long.parseLong(CourierId)).orElseThrow();
        courierRepo.delete(toDeleteCourier);
    }

    public List<Courier> getAllCouriers(){
        return courierRepo.findAll();
    }
}
