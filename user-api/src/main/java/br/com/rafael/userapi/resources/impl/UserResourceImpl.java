package br.com.rafael.userapi.resources.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.userapi.domain.User;
import br.com.rafael.userapi.resources.UserResource;
import br.com.rafael.userapi.services.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/api/users")
public class UserResourceImpl implements UserResource{
	
	private final UserService service;

	@Override
	public ResponseEntity<User> findById(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body(service.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> findAll() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body(service.findAll());
	}

}
