package com.example.demo.services;

import com.example.demo.entities.RouteSheet;
import com.example.demo.repositories.RouteSheetRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteSheetService {

    private final RouteSheetRepo routeSheetRepo;

    public RouteSheetService(RouteSheetRepo routeSheetRepo) {
        this.routeSheetRepo = routeSheetRepo;
    }

    public RouteSheet createRouteSheet(RouteSheet routeSheet){
        return routeSheetRepo.save(routeSheet);
    }

//    public RouteSheet updateRouteSheet(String routeSheetId){
//        RouteSheet toUpdateRouteSheet = routeSheetRepo.findById(Long.parseLong(routeSheetId)).orElseThrow();
//
//
//        return routeSheetRepo.save(toUpdateRouteSheet);
//    }

    public void deleteRouteSheet(String RouteSheetId){
        RouteSheet toDeleteRouteSheet = routeSheetRepo.findById(Long.parseLong(RouteSheetId)).orElseThrow();
        routeSheetRepo.delete(toDeleteRouteSheet);
    }

    public List<RouteSheet> getAllRouteSheets(){
        return routeSheetRepo.findAll();
    }
}
