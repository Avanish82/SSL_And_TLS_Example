package com.ssl.demo.service;

 

import java.util.List;

import com.ssl.demo.dto.SellerDto;

/**
 * @author - Avanish Kumar
 */
public interface RegistrationService {


    String addSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
