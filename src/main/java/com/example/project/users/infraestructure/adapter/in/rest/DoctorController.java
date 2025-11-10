package com.example.project.users.infraestructure.adapter.in.rest;

import com.example.project.users.domain.port.in.IDoctorService;
import com.example.project.users.infraestructure.adapter.in.dto.DoctorRequest;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import com.example.project.users.infraestructure.adapter.out.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/doctor")
public class DoctorController {

   private final IDoctorService doctorService;

   public DoctorController(IDoctorService doctorService) {
      this.doctorService = doctorService;
   }

   @PostMapping
   public ResponseEntity<?> createDoctor(@RequestBody DoctorRequest request) {
      Doctor doctor = new Doctor();
      User user = new User();
      user.setName(request.getName());
      user.setSurname(request.getSurname());
      user.setEmail(request.getEmail());
      user.setPassword(request.getPassword());
      user.setRole(request.getRole());
      doctor.setUser(user);
      doctor.setMasteries(request.getMasteries());

      user.setProfile(doctor);
      Doctor savedDoctor = doctorService.create(doctor);

      return ResponseEntity.ok(savedDoctor.getUser());
   }

   @GetMapping
   public ResponseEntity<?> getAllDoctors(){
      return ResponseEntity.ok(this.doctorService.findAll());
   }
}
