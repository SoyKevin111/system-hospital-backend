package com.example.project.medical.infraestructure.adapter.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vital_sign")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VitalSign {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private Boolean fever;// fiebre

   @Column(nullable = false)
   private Boolean cough;         // tos

   @Column(nullable = false)
   private Boolean fatigue;       // fatiga o cansancio

   @Column(nullable = false)
   private Boolean headache;      // dolor de cabeza

   @Column(nullable = false)
   private Boolean soreThroat;    // dolor de garganta

   @Column(nullable = false)
   private Double temperature;     // temperatura
}
