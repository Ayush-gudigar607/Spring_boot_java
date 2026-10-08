package com.devopysis.sampleCodeSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleCodeSpringBootApplication implements CommandLineRunner {

	private final UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SampleCodeSpringBootApplication.class, args);
	}

	public SampleCodeSpringBootApplication(UserService userService)
	{
		this.userService=userService;
	}

	@Override
	public void run(String... args) throws Exception {
           userService.saveUser("Ankit is press the button");
	}
}