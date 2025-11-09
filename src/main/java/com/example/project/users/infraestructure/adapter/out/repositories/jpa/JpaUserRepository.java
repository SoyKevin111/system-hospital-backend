package com.example.project.users.infraestructure.adapter.out.repositories.jpa;

import com.example.project.users.infraestructure.adapter.out.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
