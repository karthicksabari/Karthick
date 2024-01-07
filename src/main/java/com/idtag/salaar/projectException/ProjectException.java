package com.idtag.salaar.projectException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectException extends RuntimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8839169778302760464L;
	
	public ProjectException(String msg) {
		super(msg);
	}

}
