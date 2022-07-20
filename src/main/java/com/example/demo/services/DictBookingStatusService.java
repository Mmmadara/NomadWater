package com.example.demo.services;

import com.example.demo.entities.DictBookingStatus;
import com.example.demo.repositories.DictBookingStatusRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictBookingStatusService {

    private final DictBookingStatusRepo dictBookingStatusRepo;

    public DictBookingStatusService(DictBookingStatusRepo dictBookingStatusRepo) {
        this.dictBookingStatusRepo = dictBookingStatusRepo;
    }

    public DictBookingStatus createDictBookingStatus(DictBookingStatus dictBookingStatus){
        return dictBookingStatusRepo.save(dictBookingStatus);
    }

    public DictBookingStatus updateDictBookingStatus(String dictBookingStatusId, String statusName){
        DictBookingStatus toUpdateDictBookingStatus = dictBookingStatusRepo.findById(Long.parseLong(dictBookingStatusId)).orElseThrow();
        toUpdateDictBookingStatus.setStatusName(statusName);

        return dictBookingStatusRepo.save(toUpdateDictBookingStatus);
    }

    public void deleteDictBookingStatus(String DictBookingStatusId){
        DictBookingStatus toDeleteDictBookingStatus = dictBookingStatusRepo.findById(Long.parseLong(DictBookingStatusId)).orElseThrow();
        dictBookingStatusRepo.delete(toDeleteDictBookingStatus);
    }

    public List<DictBookingStatus> getAllDictBookingStatuss(){
        return dictBookingStatusRepo.findAll();
    }
}
