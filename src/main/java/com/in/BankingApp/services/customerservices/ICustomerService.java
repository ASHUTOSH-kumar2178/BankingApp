package com.in.BankingApp.model.services.customerservices;

import java.util.List;

import com.in.BankingApp.model.dto.CustomerDTO;
import com.in.BankingApp.model.valueobject.CustomerVo;

public interface ICustomerService {
    CustomerDTO createCustomer(CustomerVo customerVO);
    CustomerDTO getCustomerById(Long customerId);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO updateCustomer(Long customerId, CustomerVo customerVO);
    void deleteCustomer(Long customerId);
}
