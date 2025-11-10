package com.example.project.medical.infraestructure.adapter.out.repositories.jpa;

import com.example.project.medical.infraestructure.adapter.out.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRecipeRepository extends JpaRepository<Recipe, Long> {
}
