package br.com.rafael.userapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.userapi.domain.User;
import br.com.rafael.userapi.repositories.UserRepository;
import br.com.rafael.userapi.services.UserService;
import br.com.rafael.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // Lombok implementa o construtor
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found!!!"));
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
