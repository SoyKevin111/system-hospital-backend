package com.example.project.medical.domain.port.in;

import com.example.project.common.domain.GenericPortIn;
import com.example.project.medical.infraestructure.adapter.out.entity.Appointment;

public interface IAppointmentService extends GenericPortIn<Appointment, Long> {
}
