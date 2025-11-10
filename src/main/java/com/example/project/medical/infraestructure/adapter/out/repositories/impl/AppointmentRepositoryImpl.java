package com.example.project.medical.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.medical.domain.port.out.IAppointmentRepository;
import com.example.project.medical.infraestructure.adapter.out.entity.Appointment;
import com.example.project.medical.infraestructure.adapter.out.repositories.jpa.JpaAppointmentRepository;

public class AppointmentRepositoryImpl extends GenericRepositoryImpl<Appointment, Long> implements IAppointmentRepository {

   private final JpaAppointmentRepository jpaAppointmentRepository;

   public AppointmentRepositoryImpl(JpaAppointmentRepository jpaAppointmentRepository) {
      super(jpaAppointmentRepository);
      this.jpaAppointmentRepository = jpaAppointmentRepository;
   }

}
