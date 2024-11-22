package com.example.hello_spring_boot.mapStructure;

import com.example.hello_spring_boot.entity.customer.dto.CustomerResponse;
import com.example.hello_spring_boot.entity.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper
@Mapper(componentModel = "spring")
public interface CustomerMapper {
    default CustomerResponse mapToCustomerResponse(Object[] objects) {
        if (objects == null) {
            return null;
        }
        return new CustomerResponse(
                objects[0] != null ? objects[0].toString() : null,
                objects[1] != null ? objects[1].toString() : null,
                objects[2] != null ? objects[2].toString() : null,
                objects[3] != null ? objects[3].toString() : null,
                objects[4] != null ? objects[4].toString() : null
        );
    }
}
