package com.ssl.demo.service;

 

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssl.demo.dto.SellerDto;

/**
 * @author - Avanish Kumar
 */

@Repository
public class RegistrationRepository {

    List<SellerDto> sellerDtoList = new ArrayList<>();

    public boolean addSeller(SellerDto sellerDto) {

        return sellerDtoList.add(sellerDto);
    }

    public List<SellerDto> getSellerList() {
        return sellerDtoList;
    }
}
