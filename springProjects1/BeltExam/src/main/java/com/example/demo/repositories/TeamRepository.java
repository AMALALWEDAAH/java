package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.models.Team;
import com.example.demo.models.User;



@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	 // this method retrieves all the Shows from the database
    List<Team> findAll();
    Optional<Team> findById(Long id);
    List<Team> findByUser(User user);
   
}
