package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID uuid);

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(UUID id, CustomerDTO customerDTO);

    void delete(UUID uuid);
}
