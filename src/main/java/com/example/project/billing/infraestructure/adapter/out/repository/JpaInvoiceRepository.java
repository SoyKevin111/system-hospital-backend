package com.example.project.billing.infraestructure.adapter.out.repository;

import com.example.project.billing.infraestructure.adapter.out.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaInvoiceRepository extends JpaRepository<Invoice, Long> {
}
