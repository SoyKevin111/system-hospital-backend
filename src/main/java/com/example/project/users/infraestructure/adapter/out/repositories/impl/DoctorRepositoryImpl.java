package com.example.project.users.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.users.domain.port.out.IDoctorRepository;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import com.example.project.users.infraestructure.adapter.out.repositories.jpa.JpaDoctorRepository;

public class DoctorRepositoryImpl extends GenericRepositoryImpl<Doctor, Long> implements IDoctorRepository {

   JpaDoctorRepository repository;

   public DoctorRepositoryImpl(JpaDoctorRepository jpaDoctorRepository) {
      super(jpaDoctorRepository);
      this.repository = jpaDoctorRepository;
   }

   //metodos basicos ya heredados

   @Override
   public String getDoctorNameUpperCase(String name) {
      return this.repository.findNameUppercase(name);
   }



}
