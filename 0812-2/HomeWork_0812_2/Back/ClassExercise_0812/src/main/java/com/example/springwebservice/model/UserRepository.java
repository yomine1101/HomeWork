package com.example.springwebservice.model;

import com.example.springwebservice.model.entriy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User  findById(int id);
    Long deleteById(int id);

}
