package com.example.project.users.application.service;

import com.example.project.users.domain.port.in.IDoctorService;
import com.example.project.users.domain.port.out.IDoctorRepository;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;

import java.util.List;
import java.util.Optional;

public class DoctorService implements IDoctorService {

   private IDoctorRepository doctorRepository;

   @Override
   public Doctor create(Doctor doctor) {
      return this.doctorRepository.save(doctor);
   }

   @Override
   public Doctor update(Long aLong, Doctor entity) {
      return null;
   }

   @Override
   public void delete(Long aLong) {

   }

   @Override
   public List<Doctor> findAll() {
      return List.of();
   }

   @Override
   public Optional<Doctor> findById(Long aLong) {
      return Optional.empty();
   }

   public String getNameDoctorUppercase(String name){
      return this.doctorRepository.getDoctorNameUpperCase(name);
   }
}
