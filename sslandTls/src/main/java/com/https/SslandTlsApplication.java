package com.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SslandTlsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslandTlsApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String https() {
		return "SSL and TLS is working fine";
	}

}
