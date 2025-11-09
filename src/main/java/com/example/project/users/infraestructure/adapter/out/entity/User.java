package com.example.project.users.infraestructure.adapter.out.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String name;

   @Column(nullable = false)
   private String surname;

   @Column(nullable = false, unique = true)
   private String email;

   @Column(nullable = false)
   private String password;

   @Enumerated(EnumType.STRING)
   @Column(nullable = false)
   private Role role;

   private Boolean status = true;

   @Column(name = "created_at", updatable = false)
   private LocalDateTime createdAt;

   @Column(name = "last_updated")
   private LocalDateTime lastUpdated;

   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true) //null si no hay profile
   @JsonManagedReference //principal
   private Profile profile;

   @PrePersist
   public void prePersist() {
      createdAt = LocalDateTime.now();
   }

   @PreUpdate
   public void preUpdate() {
      lastUpdated = LocalDateTime.now();
   }
}
