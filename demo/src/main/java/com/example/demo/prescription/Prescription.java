package com.example.demo.prescription;

import com.example.demo.medicin_prescription.PrescriptionMedicine;
import com.example.demo.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "prescriptions")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID")
    private User doctor;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID")
    private User patient;

    @Column(name = "PRESCRIPTION_DATE")
    private LocalDate prescriptionDate;

    @Column(name = "NOTES")
    private String notes;

    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    private List<PrescriptionMedicine> prescriptionMedicines;
}

