package com.owuor.customer;

import org.springframework.context.annotation.Bean;
public record FraudCheckResponse(Boolean isFraudster) {
}
