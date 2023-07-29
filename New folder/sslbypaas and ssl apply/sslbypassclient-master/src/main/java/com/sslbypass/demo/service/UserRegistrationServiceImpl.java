package com.sslbypass.demo.service;

 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sslbypass.demo.dto.SellerDto;

import java.util.List;

/**
 * @author - Avanish Kumar
 */

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    Logger logger = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);
    private RestTemplate restTemplate;

    public UserRegistrationServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String registerSeller(SellerDto sellerDto) {
        String response = restTemplate.postForObject("https://localhost:8443/registration/addSeller", sellerDto, String.class);
        return response;
    }

    public List<SellerDto> getSellersList() {
        return restTemplate.getForObject("https://localhost:8443/registration/sellersList", List.class);
    }

}
