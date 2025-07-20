package com.example.demo.visits;


import com.example.demo.prescription.Prescription;
import com.example.demo.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

/**
 * Represents a visit entity in the system.
 * Each visit is associated with a patient, a doctor, and a prescription.
 */

@Entity
@Table(name = "visits")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID", nullable = false)
    private User patientId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID", nullable = false)
    private User doctorId;

    @ManyToOne
    @JoinColumn(name = "PRESCRIPTION_ID", nullable = false)
    private Prescription prescriptionId;

    @Column(name = "VISIT_DATE")
    private LocalDate visitDate;

    @Column(name = "DESCRIPTION")
    private String description;
}
