package com.example.demo.services;

import com.example.demo.entities.ConfirmationCode;
import com.example.demo.repositories.ConfirmationCodeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfirmationCodeService {

    private final ConfirmationCodeRepo confirmationCodeRepo;

    public ConfirmationCodeService(ConfirmationCodeRepo confirmationCodeRepo) {
        this.confirmationCodeRepo = confirmationCodeRepo;
    }

    public ConfirmationCode createconfirmationCode(ConfirmationCode confirmationCode){
        return confirmationCodeRepo.save(confirmationCode);
    }

    public ConfirmationCode updateconfirmationCode(String confirmationCodeId, String number){
        ConfirmationCode toUpdateConfirmationCode = confirmationCodeRepo.findById(Long.parseLong(confirmationCodeId)).orElseThrow();
        toUpdateConfirmationCode.setNumber(number);

        return confirmationCodeRepo.save(toUpdateConfirmationCode);
    }

    public void deleteconfirmationCode(String confirmationCodeId){
        ConfirmationCode toDeleteConfirmationCode = confirmationCodeRepo.findById(Long.parseLong(confirmationCodeId)).orElseThrow();
        confirmationCodeRepo.delete(toDeleteConfirmationCode);
    }

    public List<ConfirmationCode> getAllconfirmationCodes(){
        return confirmationCodeRepo.findAll();
    }
}
