package br.com.rafael.payrollapi.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.rafael.payrollapi.domain.User;

@FeignClient(name="user-api", url="http://localhost:8000") // é o nome dado no application.yml do projeto user-api
public interface UserFeign {
	
	@GetMapping(value = "/api/users/{id}")
	ResponseEntity<User> findById(@PathVariable Long id);
	
	@GetMapping
	ResponseEntity<List<User>> findAll();

}
