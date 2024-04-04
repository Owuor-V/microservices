package com.owuor.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudCheckHistoryController {
    private final FraudCheckHistoryService fraudCheckHistoryService;

    @GetMapping (path = "{customerId}")
    public FraudCheckResponse isFraudster (@PathVariable ("customerId") Integer customerId) {
        Boolean isFraudulentCustomer = fraudCheckHistoryService.isFraudulentCustomer(customerId);
        log.info("Fraud check request for customer {}", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
