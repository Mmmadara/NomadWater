package com.example.demo.services;

import com.example.demo.entities.Orders;
import com.example.demo.repositories.OrdersRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepo ordersRepo;

    public OrdersService(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }

    public Orders createOrders(Orders orders){
        return ordersRepo.save(orders);
    }

    public Orders updateOrders(String ordersId, String comment){
        Orders toUpdateOrders = ordersRepo.findById(Long.parseLong(ordersId)).orElseThrow();
        toUpdateOrders.setComment(comment);

        return ordersRepo.save(toUpdateOrders);
    }

    public void deleteOrders(String OrdersId){
        Orders toDeleteOrders = ordersRepo.findById(Long.parseLong(OrdersId)).orElseThrow();
        ordersRepo.delete(toDeleteOrders);
    }

    public List<Orders> getAllOrderss(){
        return ordersRepo.findAll();
    }
}
