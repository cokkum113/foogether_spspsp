package com.example.spring_foogether.domain.repository;

import com.example.spring_foogether.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
