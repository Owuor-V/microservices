package com.owuor.fraud;

import org.springframework.context.annotation.Bean;

public record FraudCheckResponse(Boolean isFraudster) {
}
