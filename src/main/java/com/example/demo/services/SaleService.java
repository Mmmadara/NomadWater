package com.example.demo.services;

import com.example.demo.entities.Sale;
import com.example.demo.repositories.SaleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepo saleRepo;

    public SaleService(SaleRepo saleRepo) {
        this.saleRepo = saleRepo;
    }

    public Sale createSale(Sale sale){
        return saleRepo.save(sale);
    }

    public Sale updateSale(String saleId, String name){
        Sale toUpdateSale = saleRepo.findById(Long.parseLong(saleId)).orElseThrow();
        toUpdateSale.setName(name);

        return saleRepo.save(toUpdateSale);
    }

    public void deleteSale(String SaleId){
        Sale toDeleteSale = saleRepo.findById(Long.parseLong(SaleId)).orElseThrow();
        saleRepo.delete(toDeleteSale);
    }

    public List<Sale> getAllSales(){
        return saleRepo.findAll();
    }
}
