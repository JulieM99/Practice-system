package com.example.demo.payment;

import com.example.demo.visits.Visit;
import jakarta.persistence.*;
import lombok.*;

/**
 * Represents a payment made for a visit.
 */

@Entity
@Table(name = "payments")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "VISIT_ID", nullable = false)
    private Visit visitId;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "PAYMENT_STATUS")
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
