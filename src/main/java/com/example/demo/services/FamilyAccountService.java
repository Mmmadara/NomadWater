package com.example.demo.services;

import com.example.demo.entities.FamilyAccount;
import com.example.demo.repositories.FamilyAccountRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyAccountService {

    private final FamilyAccountRepo familyAccountRepo;

    public FamilyAccountService(FamilyAccountRepo familyAccountRepo) {
        this.familyAccountRepo = familyAccountRepo;
    }

    public FamilyAccount createFamilyAccount(FamilyAccount familyAccount){
        return familyAccountRepo.save(familyAccount);
    }

    public FamilyAccount updateFamilyAccount(String familyAccountId, Double memberBonuses){
        FamilyAccount toUpdateFamilyAccount = familyAccountRepo.findById(Long.parseLong(familyAccountId)).orElseThrow();
        toUpdateFamilyAccount.setMembersBonuses(memberBonuses);

        return familyAccountRepo.save(toUpdateFamilyAccount);
    }

    public void deleteFamilyAccount(String FamilyAccountId){
        FamilyAccount toDeleteFamilyAccount = familyAccountRepo.findById(Long.parseLong(FamilyAccountId)).orElseThrow();
        familyAccountRepo.delete(toDeleteFamilyAccount);
    }

    public List<FamilyAccount> getAllFamilyAccounts(){
        return familyAccountRepo.findAll();
    }
}
