package com.example.demo.services;

import com.example.demo.entities.DictUrgency;
import com.example.demo.repositories.DictUrgencyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictUrgencyService {

    private final DictUrgencyRepo dictUrgencyRepo;

    public DictUrgencyService(DictUrgencyRepo dictUrgencyRepo) {
        this.dictUrgencyRepo = dictUrgencyRepo;
    }

    public DictUrgency createDictUrgency(DictUrgency dictUrgency){
        return dictUrgencyRepo.save(dictUrgency);
    }

    public DictUrgency updateDictUrgency(String dictUrgencyId, String name){
        DictUrgency toUpdateDictUrgency = dictUrgencyRepo.findById(Long.parseLong(dictUrgencyId)).orElseThrow();
        toUpdateDictUrgency.setName(name);

        return dictUrgencyRepo.save(toUpdateDictUrgency);
    }

    public void deleteDictUrgency(String DictUrgencyId){
        DictUrgency toDeleteDictUrgency = dictUrgencyRepo.findById(Long.parseLong(DictUrgencyId)).orElseThrow();
        dictUrgencyRepo.delete(toDeleteDictUrgency);
    }

    public List<DictUrgency> getAllDictUrgencys(){
        return dictUrgencyRepo.findAll();
    }
}
