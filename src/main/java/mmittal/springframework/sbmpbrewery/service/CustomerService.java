package mmittal.springframework.sbmpbrewery.service;

import mmittal.springframework.sbmpbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}


