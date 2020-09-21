package com.bottomline.Repository;

import com.bottomline.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAll();

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
