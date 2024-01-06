package com.idtag.salaar.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class ValidationMSG {

	public ResponseEntity<?> validateMsg(BindingResult bindingResult){
		
	if (bindingResult.hasErrors()) {
			Map<String, String> errorMsg = new HashMap<>();
			bindingResult.getFieldErrors().forEach(error -> errorMsg.put(error.getField(), error.getDefaultMessage()));
			return new ResponseEntity<Map<String, String>>(errorMsg, HttpStatus.BAD_REQUEST);
		}
		
		return null;
	}
	
}
