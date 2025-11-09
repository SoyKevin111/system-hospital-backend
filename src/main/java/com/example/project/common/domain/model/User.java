package com.example.project.common.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@MappedSuperclass
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

   @Column(nullable = false)
   private Boolean status = true;

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
