package com.devspring.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devspring.hrpayroll.entitites.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
		
	}
}
