package com.example.demo.services;

import com.example.demo.entities.OrderType;
import com.example.demo.repositories.OrderTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTypeService {

    private final OrderTypeRepo orderTypeRepo;

    public OrderTypeService(OrderTypeRepo orderTypeRepo) {
        this.orderTypeRepo = orderTypeRepo;
    }

    public OrderType createOrderType(OrderType orderType){
        return orderTypeRepo.save(orderType);
    }

    public OrderType updateOrderType(String orderTypeId, String name){
        OrderType toUpdateOrderType = orderTypeRepo.findById(Long.parseLong(orderTypeId)).orElseThrow();
        toUpdateOrderType.setName(name);

        return orderTypeRepo.save(toUpdateOrderType);
    }

    public void deleteOrderType(String OrderTypeId){
        OrderType toDeleteOrderType = orderTypeRepo.findById(Long.parseLong(OrderTypeId)).orElseThrow();
        orderTypeRepo.delete(toDeleteOrderType);
    }

    public List<OrderType> getAllOrderTypes(){
        return orderTypeRepo.findAll();
    }
}
