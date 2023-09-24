package com.project.postgresql.persistence.repository;

import com.project.postgresql.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepositoryUser extends CrudRepository<User, Long> {
}
