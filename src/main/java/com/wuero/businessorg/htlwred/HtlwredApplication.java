package com.wuero.businessorg.htlwred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class HtlwredApplication {

	public static void main(String[] args) {

		SpringApplication.run(HtlwredApplication.class, args);
	}
	@GetMapping
	String greet(@RequestParam("name")String name) {
		return "hello " + name;
	}

}

