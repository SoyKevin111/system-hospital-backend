package com.example.project.billing.domain.port;

import com.example.project.billing.infraestructure.adapter.out.Invoice;
import com.example.project.common.domain.GenericPortOut;

public interface IInvoiceRepository extends GenericPortOut<Invoice, Long> {
}
