package com.example.project.users.infraestructure.adapter.out.entity;

import com.example.project.medical.infraestructure.adapter.out.entity.Mastery;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends Profile { //actualiza cita, realiza diagnosticos, receta medica y crea citas

   @Getter @Setter
   @ManyToMany
   @JoinTable(
      name = "doctor_mastery",
      joinColumns = @JoinColumn( name = "id_doctor"),
      inverseJoinColumns = @JoinColumn( name = "id_mastery")
   )
   private List<Mastery> masteries;

}
