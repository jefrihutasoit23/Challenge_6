package com.aplikasi.chapter4.binarfud.service;

import com.aplikasi.chapter4.binarfud.entity.Customer;
import com.aplikasi.chapter4.binarfud.entity.Merchant;

import java.util.Map;

public interface InvoiceService {
    Map generateInvoice(Customer customer);
    Map generateReport(Merchant merchant);
}
