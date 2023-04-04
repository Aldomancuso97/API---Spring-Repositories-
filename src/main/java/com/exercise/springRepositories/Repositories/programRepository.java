package com.exercise.springRepositories.Repositories;

import com.exercise.springRepositories.Entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository for ProgrammingLanguage table"))
public interface programRepository extends JpaRepository<ProgrammingLanguage,Integer> {


}
