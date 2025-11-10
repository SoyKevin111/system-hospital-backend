package com.example.project.medical.infraestructure.adapter.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Diagnosis")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Diagnosis {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToMany(cascade = CascadeType.PERSIST) //persist
   @JoinTable(
      name = "diagnosis_vital_sign",
      joinColumns = @JoinColumn(name = "id_diagnosis"),
      inverseJoinColumns = @JoinColumn(name = "id_vital_sign") //tabla intermedia
   )
   private List<VitalSign> vitalSigns;

   @Column(nullable = false)
   private String observations;
}
