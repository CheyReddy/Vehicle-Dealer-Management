package com.dvm.service;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.dvm.model.Payment;
import com.dvm.model.PaymentMethod;
import com.dvm.model.PaymentStatus;
import com.dvm.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repo;

    public Payment initiatePayment(Long dealerId, Double amount, PaymentMethod method) {
        Payment payment = new Payment();
        payment.setDealerId(dealerId);
        payment.setAmount(amount);
        payment.setMethod(method);
        payment.setStatus(PaymentStatus.PENDING);
        payment.setCreatedAt(LocalDateTime.now());
        payment.setUpdatedAt(LocalDateTime.now());

        Payment saved = repo.save(payment);

        simulatePaymentSuccess(saved);

        return saved;
    }

    @Async
    public CompletableFuture<Void> simulatePaymentSuccess(Payment payment) {
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        payment.setStatus(PaymentStatus.SUCCESS);
        payment.setUpdatedAt(LocalDateTime.now());
        repo.save(payment);
        return CompletableFuture.completedFuture(null);
    }
}

