package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//crud: create, read, update, delete

import com.example.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User hoidanit);
}
