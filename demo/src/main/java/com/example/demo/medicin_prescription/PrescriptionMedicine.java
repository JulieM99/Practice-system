package com.example.demo.medicin_prescription;

import com.example.demo.medicine.Medicine;
import com.example.demo.prescription.Prescription;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "prescription_medicines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrescriptionMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "PRESCRIPTION_ID")
    private Prescription prescription;

    @ManyToOne
    @JoinColumn(name = "MEDICINE_ID")
    private Medicine medicine;

    @Column(name = "QUANTITY")
    private String quantity;
}
