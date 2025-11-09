package com.example.project.users.domain.port.out;

import com.example.project.common.domain.GenericPortOut;
import com.example.project.users.infraestructure.adapter.out.entity.Patient;

public interface IPatientRepository extends GenericPortOut<Patient, Long> {
}
