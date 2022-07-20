package com.example.demo.services;

import com.example.demo.entities.WarehouseBalance;
import com.example.demo.repositories.WarehouseBalanceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseBalanceService {

    private final WarehouseBalanceRepo warehouseBalanceRepo;

    public WarehouseBalanceService(WarehouseBalanceRepo warehouseBalanceRepo) {
        this.warehouseBalanceRepo = warehouseBalanceRepo;
    }

    public WarehouseBalance createWarehouseBalance(WarehouseBalance warehouseBalance){
        return warehouseBalanceRepo.save(warehouseBalance);
    }

    public WarehouseBalance updateWarehouseBalance(String warehouseBalanceId, Long quantity){
        WarehouseBalance toUpdateWarehouseBalance = warehouseBalanceRepo.findById(Long.parseLong(warehouseBalanceId)).orElseThrow();
        toUpdateWarehouseBalance.setQuantity(quantity);

        return warehouseBalanceRepo.save(toUpdateWarehouseBalance);
    }

    public void deleteWarehouseBalance(String WarehouseBalanceId){
        WarehouseBalance toDeleteWarehouseBalance = warehouseBalanceRepo.findById(Long.parseLong(WarehouseBalanceId)).orElseThrow();
        warehouseBalanceRepo.delete(toDeleteWarehouseBalance);
    }

    public List<WarehouseBalance> getAllWarehouseBalances(){
        return warehouseBalanceRepo.findAll();
    }
}
