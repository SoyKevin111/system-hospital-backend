package com.example.project.billing.infraestructure.adapter.out.repository;

import com.example.project.billing.domain.port.IInvoiceRepository;
import com.example.project.billing.infraestructure.adapter.out.Invoice;
import com.example.project.common.infraestructure.GenericRepositoryImpl;

public class InvoiceRepositoryImpl extends GenericRepositoryImpl<Invoice, Long> implements IInvoiceRepository {

   private final JpaInvoiceRepository jpaInvoiceRepository;

   public InvoiceRepositoryImpl(JpaInvoiceRepository jpaInvoiceRepository) {
      super(jpaInvoiceRepository);
      this.jpaInvoiceRepository = jpaInvoiceRepository;
   }

}
