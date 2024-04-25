package com.spring.transaction.management.web;

import com.spring.transaction.management.model.UserDTO;
import com.spring.transaction.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("useraddr")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public String createUser(@RequestBody UserDTO userDTO) throws Exception {
         userService.createAddressAndUser(userDTO);
        System.out.println("user and address create success");
        return "success";
    }

}
