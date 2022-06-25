package com.example.spring_foogether.domain.repository;

import com.example.spring_foogether.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
