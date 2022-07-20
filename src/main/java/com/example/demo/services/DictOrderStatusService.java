package com.example.demo.services;

import com.example.demo.entities.DictOrderStatus;
import com.example.demo.repositories.DictOrderStatusRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictOrderStatusService {

    private final DictOrderStatusRepo dictOrderStatusRepo;

    public DictOrderStatusService(DictOrderStatusRepo dictOrderStatusRepo) {
        this.dictOrderStatusRepo = dictOrderStatusRepo;
    }

    public DictOrderStatus createDictOrderStatus(DictOrderStatus dictOrderStatus){
        return dictOrderStatusRepo.save(dictOrderStatus);
    }

    public DictOrderStatus updateDictOrderStatus(String dictOrderStatusId, String className){
        DictOrderStatus toUpdateDictOrderStatus = dictOrderStatusRepo.findById(Long.parseLong(dictOrderStatusId)).orElseThrow();
        toUpdateDictOrderStatus.setClassName(className);

        return dictOrderStatusRepo.save(toUpdateDictOrderStatus);
    }

    public void deleteDictOrderStatus(String DictOrderStatusId){
        DictOrderStatus toDeleteDictOrderStatus = dictOrderStatusRepo.findById(Long.parseLong(DictOrderStatusId)).orElseThrow();
        dictOrderStatusRepo.delete(toDeleteDictOrderStatus);
    }

    public List<DictOrderStatus> getAllDictOrderStatuss(){
        return dictOrderStatusRepo.findAll();
    }
}
