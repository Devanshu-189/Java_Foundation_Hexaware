package com.hexaware.vis.services;

import java.util.List;

import com.hexaware.vis.entities.Payment;

public interface PaymentService {
    
    Payment initiatePayment(Long proposalId, double amount);

    Payment completePayment(Long paymentId);

    Payment getPaymentById(Long paymentId);

    List<Payment> getPaymentsByUserId(Long userId);
}

