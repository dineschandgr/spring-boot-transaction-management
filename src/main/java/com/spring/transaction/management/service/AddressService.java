package com.spring.transaction.management.service;

import com.spring.transaction.management.model.Address;
import com.spring.transaction.management.model.UserDTO;
import com.spring.transaction.management.repository.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = Exception.class)
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public void createAddress(UserDTO userDTO) throws Exception {
        Address address = Address.builder().postalCode(userDTO.getAddress().getPostalCode())
                .streetName(userDTO.getAddress().getStreetName())
                .user(userDTO.getUser())
                .build();

        //int a = 10 / 0;
        //addressRepository.save(address);

        throw new Exception();

    }
}
