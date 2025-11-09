package com.example.project.users.infraestructure.adapter.out.entity;

import com.example.project.common.domain.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Accounting_manager") //contador, genera la factura
public class AccountingManager extends User {}
/*El administrador de contabilidad por otro lado tiene acceso a todo lo facturado
por período y/o por área (filtro de fechas y especialidad)*/
