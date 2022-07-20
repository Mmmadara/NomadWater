package com.example.demo.services;

import com.example.demo.entities.Warehouse;
import com.example.demo.repositories.WarehouseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    private final WarehouseRepo warehouseRepo;

    public WarehouseService(WarehouseRepo warehouseRepo) {
        this.warehouseRepo = warehouseRepo;
    }

    public Warehouse createWarehouse(Warehouse warehouse){
        return warehouseRepo.save(warehouse);
    }

    public Warehouse updateWarehouse(String warehouseId, String address){
        Warehouse toUpdateWarehouse = warehouseRepo.findById(Long.parseLong(warehouseId)).orElseThrow();
        toUpdateWarehouse.setAddress(address);

        return warehouseRepo.save(toUpdateWarehouse);
    }

    public void deleteWarehouse(String WarehouseId){
        Warehouse toDeleteWarehouse = warehouseRepo.findById(Long.parseLong(WarehouseId)).orElseThrow();
        warehouseRepo.delete(toDeleteWarehouse);
    }

    public List<Warehouse> getAllWarehouses(){
        return warehouseRepo.findAll();
    }
}
