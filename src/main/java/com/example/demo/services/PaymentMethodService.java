package com.example.demo.services;

import com.example.demo.entities.PaymentMethod;
import com.example.demo.repositories.PaymentMethodRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {

    private final PaymentMethodRepo paymentMethodRepo;

    public PaymentMethodService(PaymentMethodRepo paymentMethodRepo) {
        this.paymentMethodRepo = paymentMethodRepo;
    }

    public PaymentMethod createPaymentMethod(PaymentMethod paymentMethod){
        return paymentMethodRepo.save(paymentMethod);
    }

    public PaymentMethod updatePaymentMethod(String paymentMethodId, String name){
        PaymentMethod toUpdatePaymentMethod = paymentMethodRepo.findById(Long.parseLong(paymentMethodId)).orElseThrow();
        toUpdatePaymentMethod.setName(name);

        return paymentMethodRepo.save(toUpdatePaymentMethod);
    }

    public void deletePaymentMethod(String PaymentMethodId){
        PaymentMethod toDeletePaymentMethod = paymentMethodRepo.findById(Long.parseLong(PaymentMethodId)).orElseThrow();
        paymentMethodRepo.delete(toDeletePaymentMethod);
    }

    public List<PaymentMethod> getAllPaymentMethods(){
        return paymentMethodRepo.findAll();
    }
}
