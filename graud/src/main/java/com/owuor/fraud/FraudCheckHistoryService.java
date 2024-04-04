package com.owuor.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class FraudCheckHistoryService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public Boolean isFraudulentCustomer (Integer customerId){
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDate.now())
                        .build()
        );
        return false;
    }
}
