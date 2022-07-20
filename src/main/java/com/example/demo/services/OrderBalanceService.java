package com.example.demo.services;

import com.example.demo.entities.OrderBalance;
import com.example.demo.repositories.OrderBalanceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBalanceService {

    private final OrderBalanceRepo orderBalanceRepo;

    public OrderBalanceService(OrderBalanceRepo orderBalanceRepo) {
        this.orderBalanceRepo = orderBalanceRepo;
    }

    public OrderBalance createOrderBalance(OrderBalance orderBalance){
        return orderBalanceRepo.save(orderBalance);
    }

    public OrderBalance updateOrderBalance(String orderBalanceId, Long quantity){
        OrderBalance toUpdateOrderBalance = orderBalanceRepo.findById(Long.parseLong(orderBalanceId)).orElseThrow();
        toUpdateOrderBalance.setQuantity(quantity);

        return orderBalanceRepo.save(toUpdateOrderBalance);
    }

    public void deleteOrderBalance(String OrderBalanceId){
        OrderBalance toDeleteOrderBalance = orderBalanceRepo.findById(Long.parseLong(OrderBalanceId)).orElseThrow();
        orderBalanceRepo.delete(toDeleteOrderBalance);
    }

    public List<OrderBalance> getAllOrderBalances(){
        return orderBalanceRepo.findAll();
    }
}
