package com.example.demo.services;

import com.example.demo.entities.WarehouseWorkers;
import com.example.demo.repositories.WarehouseWorkersRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseWorkersService {

    private final WarehouseWorkersRepo warehouseWorkersRepo;

    public WarehouseWorkersService(WarehouseWorkersRepo warehouseWorkersRepo) {
        this.warehouseWorkersRepo = warehouseWorkersRepo;
    }

    public WarehouseWorkers createWarehouseWorkers(WarehouseWorkers warehouseWorkers){
        return warehouseWorkersRepo.save(warehouseWorkers);
    }

    public WarehouseWorkers updateWarehouseWorkers(String warehouseWorkersId, String shopkeeperPhone){
        WarehouseWorkers toUpdateWarehouseWorkers = warehouseWorkersRepo.findById(Long.parseLong(warehouseWorkersId)).orElseThrow();
        toUpdateWarehouseWorkers.setShopkeeperPhone(shopkeeperPhone);

        return warehouseWorkersRepo.save(toUpdateWarehouseWorkers);
    }

    public void deleteWarehouseWorkers(String WarehouseWorkersId){
        WarehouseWorkers toDeleteWarehouseWorkers = warehouseWorkersRepo.findById(Long.parseLong(WarehouseWorkersId)).orElseThrow();
        warehouseWorkersRepo.delete(toDeleteWarehouseWorkers);
    }

    public List<WarehouseWorkers> getAllWarehouseWorkerss(){
        return warehouseWorkersRepo.findAll();
    }
}
