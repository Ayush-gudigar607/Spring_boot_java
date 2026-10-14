package com.devopysis.sampleCodeSpringBoot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleCodeSpringBootApplication implements CommandLineRunner {
    //userservice dependency This declares a variable that holds a reference to the UserService object.The service usually contains business logic
	private final UserService userService;



	public static void main(String[] args) {
		SpringApplication.run(SampleCodeSpringBootApplication.class, args);
	}

	//CommandLineRunner is an interface provided by Spring Boot.It allows you to execute some code automatically after the Spring application starts.
	public SampleCodeSpringBootApplication(UserService userService)
	{
		this.userService=userService;
	}

   //a run method to run the userservice its a method of commandlinerunner()
	@Override
	public void run(String... args) throws Exception {
		userService.saveUser("Ankit is saving user");
	}
}