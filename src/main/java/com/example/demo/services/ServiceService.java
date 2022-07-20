package com.example.demo.services;

import com.example.demo.entities.Service;
import com.example.demo.repositories.ServiceRepo;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    private final ServiceRepo serviceRepo;

    public ServiceService(ServiceRepo serviceRepo) {
        this.serviceRepo = serviceRepo;
    }

    public Service createService(Service service){
        return serviceRepo.save(service);
    }

    public Service updateService(String serviceId, String name){
        Service toUpdateService = serviceRepo.findById(Long.parseLong(serviceId)).orElseThrow();
        toUpdateService.setName(name);

        return serviceRepo.save(toUpdateService);
    }

    public void deleteService(String ServiceId){
        Service toDeleteService = serviceRepo.findById(Long.parseLong(ServiceId)).orElseThrow();
        serviceRepo.delete(toDeleteService);
    }

    public List<Service> getAllServices(){
        return serviceRepo.findAll();
    }
}
