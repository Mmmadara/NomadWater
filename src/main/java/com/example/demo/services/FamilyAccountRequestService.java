package com.example.demo.services;

import com.example.demo.entities.FamilyAccountRequest;
import com.example.demo.repositories.FamilyAccountRequestRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyAccountRequestService {

    private final FamilyAccountRequestRepo familyAccountRequestRepo;

    public FamilyAccountRequestService(FamilyAccountRequestRepo familyAccountRequestRepo) {
        this.familyAccountRequestRepo = familyAccountRequestRepo;
    }

    public FamilyAccountRequest createFamilyAccountRequest(FamilyAccountRequest familyAccountRequest){
        return familyAccountRequestRepo.save(familyAccountRequest);
    }

//    public FamilyAccountRequest updateFamilyAccountRequest(String familyAccountRequestId){
//        FamilyAccountRequest toUpdateFamilyAccountRequest = familyAccountRequestRepo.findById(Long.parseLong(familyAccountRequestId)).orElseThrow();
//
//        return familyAccountRequestRepo.save(toUpdateFamilyAccountRequest);
//    }

    public void deleteFamilyAccountRequest(String FamilyAccountRequestId){
        FamilyAccountRequest toDeleteFamilyAccountRequest = familyAccountRequestRepo.findById(Long.parseLong(FamilyAccountRequestId)).orElseThrow();
        familyAccountRequestRepo.delete(toDeleteFamilyAccountRequest);
    }

    public List<FamilyAccountRequest> getAllFamilyAccountRequests(){
        return familyAccountRequestRepo.findAll();
    }
}
