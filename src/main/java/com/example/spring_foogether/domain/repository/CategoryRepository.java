package com.example.spring_foogether.domain.repository;

import com.example.spring_foogether.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
