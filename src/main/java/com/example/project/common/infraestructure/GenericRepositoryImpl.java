package com.example.project.common.infraestructure;

import com.example.project.common.domain.GenericPortOut;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class GenericRepositoryImpl<T, ID> implements GenericPortOut<T, ID> {

   protected final JpaRepository<T, ID> jpaRepository;

   public GenericRepositoryImpl(JpaRepository<T, ID> jpaRepository) {
      this.jpaRepository = jpaRepository;
   }

   @Override
   public T save(T entity) {
      return jpaRepository.save(entity);
   }

   @Override
   public void deleteById(ID id) {
      jpaRepository.deleteById(id);
   }

   @Override
   public List<T> findAll() {
      return jpaRepository.findAll();
   }

   @Override
   public Optional<T> findById(ID id) {
      return jpaRepository.findById(id);
   }
}
