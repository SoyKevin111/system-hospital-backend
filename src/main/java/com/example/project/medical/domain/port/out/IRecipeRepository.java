package com.example.project.medical.domain.port.out;

import com.example.project.common.domain.GenericPortOut;
import com.example.project.medical.infraestructure.adapter.out.entity.Recipe;

public interface IRecipeRepository extends GenericPortOut<Recipe, Long> {
}
