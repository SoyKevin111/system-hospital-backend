package com.example.project.medical.infraestructure.adapter.out.repositories.jpa;

import com.example.project.medical.infraestructure.adapter.out.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDiagnosisRepository extends JpaRepository<Diagnosis, Long> {
}
