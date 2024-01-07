package com.idtag.salaar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idtag.salaar.entity.Project;
import com.idtag.salaar.service.ProjectService;
import com.idtag.salaar.service.ValidationMSG;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private ValidationMSG validationMSG;

	@PostMapping("/DEMO")
	public ResponseEntity<?> sdEMO(@RequestBody Project project, BindingResult bindingResult) {
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Project project, BindingResult bindingResult) {

		ResponseEntity<?> entity = validationMSG.validateMsg(bindingResult);

		if (entity != null) {
			return entity;
		}
		projectService.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}

}
