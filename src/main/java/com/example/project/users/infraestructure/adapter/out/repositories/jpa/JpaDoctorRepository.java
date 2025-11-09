package com.example.project.users.infraestructure.adapter.out.repositories.jpa;

import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDoctorRepository extends JpaRepository<Doctor, Long> {
}
