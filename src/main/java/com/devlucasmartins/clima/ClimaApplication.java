package com.devlucasmartins.clima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaApplication.class, args);
	}

}
