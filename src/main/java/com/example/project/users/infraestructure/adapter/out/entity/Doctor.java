package com.example.project.users.infraestructure.adapter.out.entity;

import com.example.project.common.domain.model.User;
import com.example.project.medical.infraestructure.adapter.out.entity.Mastery;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Doctor")
@Getter @Setter
public class Doctor extends User { //actualiza cita, realiza diagnosticos, receta medica y crea citas

   @ManyToMany
   @JoinTable(
      name = "doctor_mastery",
      joinColumns = @JoinColumn( name = "id_doctor"),
      inverseJoinColumns = @JoinColumn( name = "id_mastery")
   )
   private List<Mastery> masteries;
}
