package com.example.project.users.infraestructure.adapter.in.dto;

import com.example.project.medical.infraestructure.adapter.out.entity.Mastery;
import com.example.project.users.infraestructure.adapter.out.entity.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DoctorRequest {
   private String name;
   private String surname;
   private String email;
   private String password;
   private Role role;
   private List<Mastery> masteries;
}
