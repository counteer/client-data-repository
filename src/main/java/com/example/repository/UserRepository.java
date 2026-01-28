package com.example.repository;

import java.util.List;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path="users")
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String firstName);

}
