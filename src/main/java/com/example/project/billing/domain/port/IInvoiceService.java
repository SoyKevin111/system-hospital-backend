package com.example.project.billing.domain.port;

import com.example.project.billing.infraestructure.adapter.out.Invoice;
import com.example.project.common.domain.GenericPortIn;

public interface IInvoiceService extends GenericPortIn<Invoice, Long> {
}
