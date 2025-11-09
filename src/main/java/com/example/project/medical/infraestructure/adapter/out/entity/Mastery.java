package com.example.project.medical.infraestructure.adapter.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Mastery")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mastery {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(nullable = false)
   private String name;
   @Column(nullable = false)
   private String code;
   @Column(nullable = false)
   private String description;
   @Column(nullable = false)
   private double price;
}
