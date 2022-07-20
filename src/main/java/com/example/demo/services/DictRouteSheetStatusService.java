package com.example.demo.services;

import com.example.demo.entities.DictRouteSheetStatus;
import com.example.demo.repositories.DictRouteSheetStatusRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictRouteSheetStatusService {
    private final DictRouteSheetStatusRepo dictRouteSheetRepo;

    public DictRouteSheetStatusService(DictRouteSheetStatusRepo dictRouteSheetRepo) {
        this.dictRouteSheetRepo = dictRouteSheetRepo;
    }

    public DictRouteSheetStatus createDictRouteSheetStatus(DictRouteSheetStatus dictRouteSheet){
        return dictRouteSheetRepo.save(dictRouteSheet);
    }

    public DictRouteSheetStatus updateDictRouteSheetStatus(String dictRouteSheetId, String name){
        DictRouteSheetStatus toUpdateDictRouteSheetStatus = dictRouteSheetRepo.findById(Long.parseLong(dictRouteSheetId)).orElseThrow();
        toUpdateDictRouteSheetStatus.setName(name);

        return dictRouteSheetRepo.save(toUpdateDictRouteSheetStatus);
    }

    public void deleteDictRouteSheetStatus(String DictRouteSheetStatusId){
        DictRouteSheetStatus toDeleteDictRouteSheetStatus = dictRouteSheetRepo.findById(Long.parseLong(DictRouteSheetStatusId)).orElseThrow();
        dictRouteSheetRepo.delete(toDeleteDictRouteSheetStatus);
    }

    public List<DictRouteSheetStatus> getAllDictRouteSheetStatuss(){
        return dictRouteSheetRepo.findAll();
    }
}
