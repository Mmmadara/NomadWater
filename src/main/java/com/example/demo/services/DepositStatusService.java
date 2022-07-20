package com.example.demo.services;

import com.example.demo.entities.DepositStatus;
import com.example.demo.repositories.DepositStatusRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositStatusService {

    private final DepositStatusRepo depositStatusRepo;

    public DepositStatusService(DepositStatusRepo depositStatusRepo) {
        this.depositStatusRepo = depositStatusRepo;
    }

    public DepositStatus createDepositStatus(DepositStatus depositStatus){
        return depositStatusRepo.save(depositStatus);
    }

    public DepositStatus updateDepositStatus(String depositStatusId, String name){
        DepositStatus toUpdateDepositStatus = depositStatusRepo.findById(Long.parseLong(depositStatusId)).orElseThrow();
        toUpdateDepositStatus.setName(name);

        return depositStatusRepo.save(toUpdateDepositStatus);
    }

    public void deleteDepositStatus(String DepositStatusId){
        DepositStatus toDeleteDepositStatus = depositStatusRepo.findById(Long.parseLong(DepositStatusId)).orElseThrow();
        depositStatusRepo.delete(toDeleteDepositStatus);
    }

    public List<DepositStatus> getAllDepositStatuss(){
        return depositStatusRepo.findAll();
    }
}
