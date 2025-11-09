package com.example.project.billing.infraestructure.adapter.out.entity;

import com.example.project.medical.infraestructure.adapter.out.entity.Appointment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Invoice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @OneToOne
   @JoinColumn(name = "appointment_id", nullable = false, referencedColumnName = "id")
   private Appointment appointment;

   private String code; //INV-000N

   @Column( nullable = false)
   private Double subtotal;

   @Column(nullable = false)
   private Double total;

   @Column(name = "created_at", nullable = false, updatable = false)
   private LocalDateTime createdAt;

   @PrePersist
   public void prePersist() {
      createdAt = LocalDateTime.now();
   }

}
