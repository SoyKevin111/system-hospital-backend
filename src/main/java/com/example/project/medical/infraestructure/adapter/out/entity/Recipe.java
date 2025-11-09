package com.example.project.medical.infraestructure.adapter.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Recipe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToMany
   @JoinTable(
      name ="recipe_medical_supply",
      joinColumns = @JoinColumn(name = "id_recipe"),
      inverseJoinColumns = @JoinColumn(name = "id_medical_supply") //tabla intermedia
   )
   private List<MedicalSupply> medicalSupplies;
}
