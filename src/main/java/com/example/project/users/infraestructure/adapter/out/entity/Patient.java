package com.example.project.users.infraestructure.adapter.out.entity;

import com.example.project.common.domain.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patient extends User {}
