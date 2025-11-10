package com.example.project.medical.infraestructure.adapter.out.repositories.impl;

import com.example.project.common.infraestructure.GenericRepositoryImpl;
import com.example.project.medical.domain.port.out.IRecipeRepository;
import com.example.project.medical.infraestructure.adapter.out.entity.Recipe;
import com.example.project.medical.infraestructure.adapter.out.repositories.jpa.JpaRecipeRepository;

public class RecipeRespositoryImpl extends GenericRepositoryImpl<Recipe, Long> implements IRecipeRepository {

   private final JpaRecipeRepository jpaRecipeRepository;

   public RecipeRespositoryImpl(JpaRecipeRepository jpaRecipeRepository) {
      super(jpaRecipeRepository);
      this.jpaRecipeRepository = jpaRecipeRepository;
   }
}
