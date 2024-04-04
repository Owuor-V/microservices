package com.owuor.fraud;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "fraud")
public class FraudCheckHistory {
    @Id
//    @SequenceGenerator(
//            name = "fraud_id_sequence",
//            sequenceName = "fraud_id_sequence"
//    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDate createdAt;
}
