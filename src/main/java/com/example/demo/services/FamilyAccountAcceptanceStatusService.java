package com.example.demo.services;

import com.example.demo.entities.FamilyAccountAcceptanceStatus;
import com.example.demo.repositories.FamilyAccountAcceptanceStatusRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyAccountAcceptanceStatusService {

    private final FamilyAccountAcceptanceStatusRepo familyAccountAcceptanceRepo;

    public FamilyAccountAcceptanceStatusService(FamilyAccountAcceptanceStatusRepo familyAccountAcceptanceRepo) {
        this.familyAccountAcceptanceRepo = familyAccountAcceptanceRepo;
    }

    public FamilyAccountAcceptanceStatus createFamilyAccountAcceptance(FamilyAccountAcceptanceStatus familyAccountAcceptance){
        return familyAccountAcceptanceRepo.save(familyAccountAcceptance);
    }

    public FamilyAccountAcceptanceStatus updateFamilyAccountAcceptance(String familyAccountAcceptanceId, String status){
        FamilyAccountAcceptanceStatus toUpdateFamilyAccountAcceptance = familyAccountAcceptanceRepo.findById(Long.parseLong(familyAccountAcceptanceId)).orElseThrow();
        toUpdateFamilyAccountAcceptance.setStatus(status);

        return familyAccountAcceptanceRepo.save(toUpdateFamilyAccountAcceptance);
    }

    public void deleteFamilyAccountAcceptance(String FamilyAccountAcceptanceId){
        FamilyAccountAcceptanceStatus toDeleteFamilyAccountAcceptance = familyAccountAcceptanceRepo.findById(Long.parseLong(FamilyAccountAcceptanceId)).orElseThrow();
        familyAccountAcceptanceRepo.delete(toDeleteFamilyAccountAcceptance);
    }

    public List<FamilyAccountAcceptanceStatus> getAllFamilyAccountAcceptances(){
        return familyAccountAcceptanceRepo.findAll();
    }
}
