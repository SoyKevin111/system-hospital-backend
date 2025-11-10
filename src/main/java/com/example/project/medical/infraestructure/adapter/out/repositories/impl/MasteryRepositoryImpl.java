package com.example.project.medical.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.medical.domain.port.out.IMasteryRepository;
import com.example.project.medical.infraestructure.adapter.out.entity.Mastery;
import com.example.project.medical.infraestructure.adapter.out.repositories.jpa.JpaMasteryRepository;

public class MasteryRepositoryImpl extends GenericRepositoryImpl<Mastery, Long> implements IMasteryRepository {

   private final JpaMasteryRepository jpaMasteryRepository;

   public MasteryRepositoryImpl(JpaMasteryRepository jpaMasteryRepository) {
      super(jpaMasteryRepository);
      this.jpaMasteryRepository = jpaMasteryRepository;
   }

}
