package com.example.project.medical.infraestructure.adapter.out.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
