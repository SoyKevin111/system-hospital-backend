package com.example.project.users.application.service;

import com.example.project.users.domain.port.in.IDoctorService;
import com.example.project.users.domain.port.out.IDoctorRepository;
import com.example.project.users.domain.port.out.IUserRepository;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import com.example.project.users.infraestructure.adapter.out.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService implements IDoctorService {

   private final IDoctorRepository doctorRepository;
   private final IUserRepository userRepository;

   public DoctorService(IDoctorRepository doctorRepository, IUserRepository userRepository) {
      this.doctorRepository = doctorRepository;
      this.userRepository = userRepository;
   }

   @Override
   public Doctor create(Doctor doctor) {
      User savedUser =  this.userRepository.save(doctor.getUser());
      doctor.setUser(savedUser); //asignar el usuario guardado al doctor
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
      return this.doctorRepository.findAll();
   }

   @Override
   public Optional<Doctor> findById(Long aLong) {
      return Optional.empty();
   }

}
