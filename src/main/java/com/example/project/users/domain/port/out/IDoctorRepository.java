package com.example.project.users.domain.port.out;

import com.example.project.common.domain.GenericPortOut;
import com.example.project.users.infraestructure.adapter.out.entity.Doctor;

public interface IDoctorRepository extends GenericPortOut<Doctor, Long> {
   String getDoctorNameUpperCase(String name);
}
