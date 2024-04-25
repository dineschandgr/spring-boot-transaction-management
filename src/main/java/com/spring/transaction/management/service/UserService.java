package com.spring.transaction.management.service;


import com.spring.transaction.management.model.User;
import com.spring.transaction.management.model.UserDTO;
import com.spring.transaction.management.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressService addressService;

    public void createAddressAndUser(UserDTO userDTO) throws Exception {
        User user = User.builder().userName(userDTO.getUser().getUserName())
                .age(userDTO.getUser().getAge()).build();
        user = userRepository.save(user);

        System.out.println("user create complete");

        //set user id in the DTO to create Address
        userDTO.getUser().setId(user.getId());
        addressService.createAddress(userDTO);

        System.out.println("address create complete");

    }
}
