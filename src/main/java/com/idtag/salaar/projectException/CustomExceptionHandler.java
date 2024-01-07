package com.idtag.salaar.projectException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public final ResponseEntity<Object> customProjectException(ProjectException ex, WebRequest request) {
		ProjectExceptionResponse exception = new ProjectExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exception, HttpStatus.BAD_REQUEST);
	}


}