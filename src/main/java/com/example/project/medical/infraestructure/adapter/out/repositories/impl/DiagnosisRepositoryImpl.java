package com.example.project.medical.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.medical.domain.port.out.IDiagnosisRepository;
import com.example.project.medical.infraestructure.adapter.out.entity.Diagnosis;
import com.example.project.medical.infraestructure.adapter.out.repositories.jpa.JpaDiagnosisRepository;

public class DiagnosisRepositoryImpl extends GenericRepositoryImpl<Diagnosis, Long> implements IDiagnosisRepository {

   private final JpaDiagnosisRepository jpaDiagnosisRepository;

   public DiagnosisRepositoryImpl(JpaDiagnosisRepository jpaDiagnosisRepository) {
      super(jpaDiagnosisRepository);
      this.jpaDiagnosisRepository = jpaDiagnosisRepository;
   }

}
