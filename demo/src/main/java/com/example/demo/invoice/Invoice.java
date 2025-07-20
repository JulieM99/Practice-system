package com.example.demo.invoice;

import com.example.demo.payment.Payment;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

/**
 * Invoice entity representing an invoice in the system.
 * It contains details about the invoice such as the associated payment, invoice date, and status.
 */

@Entity
@Table(name = "invoices")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Invoice {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_ID", nullable = false)
    private Payment paymentId;

    @Column(name = "INVOICE_DATE", nullable = false)
    private LocalDate invoiceDate;

    @Column(name = "INVOICE_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;

}
