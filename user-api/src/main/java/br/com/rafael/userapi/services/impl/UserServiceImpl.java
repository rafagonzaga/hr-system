package br.com.rafael.userapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.rafael.userapi.domain.User;
import br.com.rafael.userapi.repositories.UserRepository;
import br.com.rafael.userapi.services.UserService;
import br.com.rafael.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor // Lombok implementa o construtor
@Slf4j
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;
	private final Environment env;

	@Override
	public User findById(Long id) {
		log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found!!!"));
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
