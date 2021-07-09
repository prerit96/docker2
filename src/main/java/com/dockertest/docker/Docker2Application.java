package com.dockertest.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dockertest.docker.controller.AppController;

@SpringBootApplication
public class Docker2Application {

	public static void main(String[] args) {
		SpringApplication.run(Docker2Application.class, args);
	}

	
}
