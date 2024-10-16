package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private String transactionId;
    private Map<String, Seat> eventSeatMap; //String contains eventName; Map because each transaction can have upto 4 seats booked
    private PaymentGateway paymentGateway;
    private TransactionStatus transactionStatus;
    private Map<Integer, PaymentGateway> transactionRetryMap;
    private Long totalAmountPaid;
}
