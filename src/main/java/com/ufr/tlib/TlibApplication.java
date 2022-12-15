package com.ufr.tlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages= {"com.ufr.tlib"})
public class TlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(TlibApplication.class, args);
	}

}
