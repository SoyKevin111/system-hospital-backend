package com.example.project.users.infraestructure.adapter.out.repositories.jpa;

import com.example.project.users.infraestructure.adapter.out.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaDoctorRepository extends JpaRepository<Doctor, Long> {
   @Query("SELECT UPPER(d.name) FROM Doctor d WHERE d.name = :name")
   String findNameUppercase(@Param("name") String name);

}
