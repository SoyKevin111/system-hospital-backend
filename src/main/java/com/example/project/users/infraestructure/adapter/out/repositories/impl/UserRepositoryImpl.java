package com.example.project.users.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.users.domain.port.out.IUserRepository;
import com.example.project.users.infraestructure.adapter.out.entity.User;
import com.example.project.users.infraestructure.adapter.out.repositories.jpa.JpaUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends GenericRepositoryImpl<User, Long> implements IUserRepository {

   private final JpaUserRepository repository;

   public UserRepositoryImpl(JpaUserRepository jpaUserRepository) {
      super(jpaUserRepository);
      this.repository = jpaUserRepository;
   }

}
