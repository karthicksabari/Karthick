package com.idtag.salaar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idtag.salaar.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
