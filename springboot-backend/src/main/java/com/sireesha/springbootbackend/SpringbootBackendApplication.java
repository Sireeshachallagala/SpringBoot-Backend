package com.sireesha.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sireesha.springbootbackend.model.User;
import com.sireesha.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		userRepository.save(new User("Siri","Challagala","Siri@gmail.com"));
		userRepository.save(new User("Riya","Vemuri","Riya@gmail.com"));
		userRepository.save(new User("Rihu","Vemuri","Rihu@gmail.com"));
	}

}
