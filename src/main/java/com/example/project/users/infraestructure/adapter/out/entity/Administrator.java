package com.example.project.users.infraestructure.adapter.out.entity;

import com.example.project.common.domain.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Administrator") //se encarga de crear entidades por rol, menos paciente.
public class Administrator extends User {}
