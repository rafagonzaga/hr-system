package br.com.rafael.payrollapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.payrollapi.domain.Payroll;
import br.com.rafael.payrollapi.domain.User;
import br.com.rafael.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/api/payments")
public class PayrollResource {
	
	private final PayrollService service;
	
	@GetMapping(value="/{workerId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
		
		return ResponseEntity.ok().body(service.getPayment(workerId, payment));
	}
}
