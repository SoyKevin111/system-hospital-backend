package com.example.project.common.domain;

import java.util.List;
import java.util.Optional;

public interface GenericPortIn<T, ID> {
   T create(T entity);
   T update(ID id, T entity);
   void delete(ID id);
   List<T> findAll();
   Optional<T> findById(ID id);
}
