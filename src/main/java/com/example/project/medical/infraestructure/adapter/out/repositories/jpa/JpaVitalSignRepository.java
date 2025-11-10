package com.example.project.medical.infraestructure.adapter.out.repositories.jpa;

import com.example.project.medical.infraestructure.adapter.out.entity.VitalSign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaVitalSignRepository extends JpaRepository<VitalSign, Long> {
}
