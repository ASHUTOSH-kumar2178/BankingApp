package com.in.BankingApp.services.customerservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.in.BankingApp.model.dto.CustomerDTO;
import com.in.BankingApp.model.valueobject.CustomerVo;
import com.in.BankingApp.repository.BranchRepository;
import com.in.BankingApp.repository.CustomerRepository;
import com.in.BankingApp.model.entity.Branch;
import com.in.BankingApp.model.entity.Customer;

public class CustomerServiceImpl  implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BranchRepository branchRepository;

    /**
     * This function is To create Customer in Banks
     */
    @Override
    public CustomerDTO createCustomer(CustomerVo customerVO) {
        
        Branch branch = branchRepository.findById(customerVO.getBranchId()).orElseThrow(()->new RuntimeException("Branch not found"));

        Customer customer = new Customer();
        customer.setName(customerVO.getName());
        customer.setEmail(customerVO.getEmail());
        customer.setPhone(customerVO.getPhone());
        customer.setBranch(branch);


    }

    @Override
    public CustomerDTO getCustomerById(Long customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public CustomerDTO updateCustomer(Long customerId, CustomerVo customerVO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(Long customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

}
