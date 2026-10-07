package com.devopysis.sampleCodeSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleCodeSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleCodeSpringBootApplication.class, args);
	}
    UserService userService=new UserService(new MySqlDatabase());
	@Override
	public void run(String... args) throws Exception {
		userService.saveUser("Ankit is saving the value");
	}
}
