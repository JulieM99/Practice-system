package com.example.demo.medicine;

import com.example.demo.medicin_prescription.PrescriptionMedicine;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "medicine")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Medicine {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DOSAGE", nullable = false)
    private String dosage;

    @OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL)
    private List<PrescriptionMedicine> prescriptionMedicines;
}
