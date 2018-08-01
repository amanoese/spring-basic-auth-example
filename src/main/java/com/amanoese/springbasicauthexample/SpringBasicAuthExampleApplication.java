package com.amanoese.springbasicauthexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBasicAuthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicAuthExampleApplication.class, args);
	}

	public String index(){
	    return "Hello,World!";
    }
}
