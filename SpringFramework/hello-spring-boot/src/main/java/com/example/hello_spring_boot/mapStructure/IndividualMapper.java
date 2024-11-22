package com.example.hello_spring_boot.mapStructure;

import com.example.hello_spring_boot.entity.customer.dto.CustomerResponse;
import com.example.hello_spring_boot.entity.individual.entity.Individual;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IndividualMapper {
    CustomerResponse toCustomerResponse(Individual individual);
}
