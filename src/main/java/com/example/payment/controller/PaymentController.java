package com.example.payment.controller;

import com.example.payment.model.Payment;
import com.example.payment.proxy.Paymentsproxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    private final Paymentsproxy paymentsproxy;

    public PaymentController(Paymentsproxy paymentsproxy) {
        this.paymentsproxy = paymentsproxy;
    }

    @PostMapping("/payment")
    public Payment makePayment(@RequestBody Payment payment){
        return paymentsproxy.createPayment(payment);
    }
}
