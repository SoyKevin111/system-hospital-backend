package com.example.project.medical.infraestructure.adapter.out.entity;

public enum Status {
   ASSIGNED("Asignado"),
   IN_PROGRESS("En Progreso"),
   FINISHED("Finalizado");

   private final String displayName;

   Status(String displayName) {
      this.displayName = displayName;
   }
   public String getDisplayName() {
      return displayName;
   }
   @Override
   public String toString() {
      return displayName;
   }
}

