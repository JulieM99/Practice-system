package com.example.demo.specialization;


import com.example.demo.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "specializations")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID", nullable = false)
    private User doctorId;

    @Column(name = "SPECIALIZATION")
    private String specializationName;
}
