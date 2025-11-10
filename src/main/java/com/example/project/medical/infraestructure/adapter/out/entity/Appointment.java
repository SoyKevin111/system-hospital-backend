package com.example.project.medical.infraestructure.adapter.out.entity;

import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import com.example.project.users.infraestructure.adapter.out.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Appointment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne//lectura
   @JoinColumn(name = "id_doctor", referencedColumnName = "id")
   private Doctor doctor;

   @ManyToOne//lectura
   @JoinColumn(name = "id_patient", referencedColumnName = "id", nullable = false)
   private User patient;

   @OneToOne(cascade = CascadeType.PERSIST)//persist
   @JoinColumn(name = "id_diagnosis", referencedColumnName = "id")
   private Diagnosis diagnosis; //diagnostico

   @OneToOne(cascade = CascadeType.PERSIST)//persist
   @JoinColumn(name = "id_recipe", referencedColumnName = "id")
   private Recipe recipe; //receta

   @ManyToOne //lectura
   @JoinColumn(name = "id_mastery", referencedColumnName = "id")
   private Mastery mastery; //maestria/especialidad

   @Enumerated(EnumType.STRING)
   @Column(nullable = false)
   private Status status; //estado

   @Column(name = "date", nullable = false)
   private LocalDateTime date; //fecha y hora de la cita medica

   @Column(name = "created_at", nullable = false, updatable = false)
   private LocalDateTime createdAt;

   @Column(name = "last_updated")
   private LocalDateTime lastUpdated;

   @PrePersist
   public void prePersist() {
      createdAt = LocalDateTime.now();
   }

   @PreUpdate
   public void preUpdate() {
      lastUpdated = LocalDateTime.now();
   }

}
