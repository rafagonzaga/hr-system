package br.com.rafael.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rafael.userapi.domain.User;
import br.com.rafael.userapi.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.saveAll(List.of(
				new User(null, "Valdir Cezar", "valdir@gmail.com", "12345", 30.0),
				new User(null, "Rafael Gonzaga", "rafael@gmail.com", "524100", 25.0)
				));
		
	}

}
