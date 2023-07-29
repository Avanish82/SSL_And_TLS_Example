package com.sslbypass.demo.service;

 

import java.util.List;

import com.sslbypass.demo.dto.SellerDto;

/**
 * @author - Avanish Kumar
 */

public interface UserRegistrationService {
    String registerSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
