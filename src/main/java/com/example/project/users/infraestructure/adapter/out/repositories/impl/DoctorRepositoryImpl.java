package com.example.project.users.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.users.domain.port.out.IDoctorRepository;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import com.example.project.users.infraestructure.adapter.out.repositories.jpa.JpaDoctorRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepositoryImpl extends GenericRepositoryImpl<Doctor, Long> implements IDoctorRepository {

   private final JpaDoctorRepository repository;

   public DoctorRepositoryImpl(JpaDoctorRepository jpaDoctorRepository) {
      super(jpaDoctorRepository);
      this.repository = jpaDoctorRepository;
   }

   //metodos basicos ya heredados


}
