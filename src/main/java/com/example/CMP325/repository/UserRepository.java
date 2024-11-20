package com.example.CMP325.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.CMP325.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {    
    User findByFullName(String fullName);
}
