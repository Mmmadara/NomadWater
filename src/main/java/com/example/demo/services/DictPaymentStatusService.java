package com.example.demo.services;

import com.example.demo.entities.DictPaymentStatus;
import com.example.demo.repositories.DictPaymentStatusRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictPaymentStatusService {
    private final DictPaymentStatusRepo dictPaymentStatusRepo;

    public DictPaymentStatusService(DictPaymentStatusRepo dictPaymentStatusRepo) {
        this.dictPaymentStatusRepo = dictPaymentStatusRepo;
    }

    public DictPaymentStatus createDictPaymentStatus(DictPaymentStatus dictPaymentStatus){
        return dictPaymentStatusRepo.save(dictPaymentStatus);
    }

    public DictPaymentStatus updateDictPaymentStatus(String dictPaymentStatusId, String className){
        DictPaymentStatus toUpdateDictPaymentStatus = dictPaymentStatusRepo.findById(Long.parseLong(dictPaymentStatusId)).orElseThrow();
        toUpdateDictPaymentStatus.setClassName(className);

        return dictPaymentStatusRepo.save(toUpdateDictPaymentStatus);
    }

    public void deleteDictPaymentStatus(String DictPaymentStatusId){
        DictPaymentStatus toDeleteDictPaymentStatus = dictPaymentStatusRepo.findById(Long.parseLong(DictPaymentStatusId)).orElseThrow();
        dictPaymentStatusRepo.delete(toDeleteDictPaymentStatus);
    }

    public List<DictPaymentStatus> getAllDictPaymentStatuss(){
        return dictPaymentStatusRepo.findAll();
    }
}
