package com.example.demo.services;

import com.example.demo.entities.Deposit;
import com.example.demo.repositories.DepositRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositService {

    private final DepositRepo depositRepo;

    public DepositService(DepositRepo depositRepo) {
        this.depositRepo = depositRepo;
    }

    public Deposit createDeposit(Deposit deposit){
        return depositRepo.save(deposit);
    }

//    nothing to change
//    public Deposit updateDepositCar(String DepositId){
//        Deposit toUpdateDeposit = depositRepo.findById(Long.parseLong(DepositId)).orElseThrow();
//
//        return depositRepo.save(toUpdateDeposit);
//    }

    public void deleteDeposit(String DepositId){
        Deposit toDeleteDeposit = depositRepo.findById(Long.parseLong(DepositId)).orElseThrow();
        depositRepo.delete(toDeleteDeposit);
    }

    public List<Deposit> getAllDeposits(){
        return depositRepo.findAll();
    }
}
