package com.example.project.users.infraestructure.adapter.in.rest;

import com.example.project.users.domain.port.in.IDoctorService;
import com.example.project.users.infraestructure.adapter.in.dto.DoctorRequest;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import com.example.project.users.infraestructure.adapter.out.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

   private final IDoctorService doctorService;

   public UserController(IDoctorService doctorService) {
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

      Map<String, Object> response = new HashMap<>();
      response.put("doctor", savedDoctor);
      response.put("user", savedDoctor.getUser());

      return ResponseEntity.ok(response);
   }

   @GetMapping
   public ResponseEntity<?> getAllDoctors(){
      return ResponseEntity.ok(this.doctorService.findAll());
   }
}
