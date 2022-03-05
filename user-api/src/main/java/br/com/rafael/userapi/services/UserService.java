package br.com.rafael.userapi.services;

import java.util.List;

import br.com.rafael.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	List<User> findAll();

}
