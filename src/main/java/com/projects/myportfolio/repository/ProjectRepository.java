package com.projects.myportfolio.repository;

import com.projects.myportfolio.collections.Projects;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Projects,String> {

}
