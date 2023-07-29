package com.sslbypass.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sslbypass.demo.dto.SellerDto;
import com.sslbypass.demo.service.UserRegistrationService;

import java.util.List;

/**
 * @author - Avanish Kumar
 */

@RestController
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("/register/seller")
    public String registerAsSeller(@RequestBody SellerDto sellerDto) {
        return userRegistrationService.registerSeller(sellerDto);
    }

    @GetMapping("/sellerList")
    public List<SellerDto> getSellersList() {
        return userRegistrationService.getSellersList();
    }
}
