package com.ssl.demo.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ssl.demo.dto.SellerDto;
import com.ssl.demo.service.RegistrationService;

import java.util.List;

/**
 * @author - Avanish Kumar
 */

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/addSeller")
    public String addSeller(@RequestBody SellerDto sellerDto){
        return registrationService.addSeller(sellerDto);
    }

    @GetMapping("/sellersList")
    public List<SellerDto> getSellersList() {
        return registrationService.getSellersList();
    }
}
