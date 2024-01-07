package com.idtag.salaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idtag.salaar.entity.Project;
import com.idtag.salaar.projectException.ProjectException;
import com.idtag.salaar.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier());
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectException("the project ID '" + project.getProjectIdentifier() + "' already exists.");
		}
	};

}
