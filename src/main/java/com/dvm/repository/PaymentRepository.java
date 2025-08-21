package com.dvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvm.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
