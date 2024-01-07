package com.idtag.salaar.projectException;

public class ProjectExceptionResponse {

	String projectIdException;

	public ProjectExceptionResponse(String projectIdException) {
		this.projectIdException = projectIdException;
	}

	/**
	 * @return the projectIdException
	 */
	public String getProjectIdException() {
		return projectIdException;
	}

	/**
	 * @param projectIdException the projectIdException to set
	 */
	public void setProjectIdException(String projectIdException) {
		this.projectIdException = projectIdException;
	}

}
