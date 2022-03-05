package br.com.rafael.userapi.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {
	
	
	private LocalDateTime timestamp;
	private String error;
	private Integer status;
	private String path; // pegar o endpoint onde gerou o erro

}
