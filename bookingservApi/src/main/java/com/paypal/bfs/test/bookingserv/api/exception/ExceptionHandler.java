/**
 * 
 */
package com.paypal.bfs.test.bookingserv.api.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ANKIT RATHOD
 *
 */
@ControllerAdvice
public class ExceptionHandler {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach((error) -> {
			
			errors.put(error.getField(), error.getDefaultMessage());
		});
		System.out.println(errors);
		return errors;
	}
}
