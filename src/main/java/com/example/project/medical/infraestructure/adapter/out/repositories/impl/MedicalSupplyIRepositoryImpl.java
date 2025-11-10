package com.example.project.medical.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.medical.domain.port.out.IMedicalSupplyRepository;
import com.example.project.medical.infraestructure.adapter.out.entity.MedicalSupply;
import com.example.project.medical.infraestructure.adapter.out.repositories.jpa.JpaMedicalSupplyRepository;

public class MedicalSupplyIRepositoryImpl extends GenericRepositoryImpl<MedicalSupply, Long> implements IMedicalSupplyRepository {

   private final JpaMedicalSupplyRepository jpaMedicalSupplyRepository;

   public MedicalSupplyIRepositoryImpl(JpaMedicalSupplyRepository jpaMedicalSupplyRepository) {
      super(jpaMedicalSupplyRepository);
      this.jpaMedicalSupplyRepository = jpaMedicalSupplyRepository;
   }
}
