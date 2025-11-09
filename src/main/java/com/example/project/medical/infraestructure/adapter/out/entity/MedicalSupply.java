package com.example.project.medical.infraestructure.adapter.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "medical_supply")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalSupply {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String name;

   @Column(nullable = false)
   private String description;

   @Column(nullable = false)
   private BigDecimal price;
}
