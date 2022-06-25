package com.example.spring_foogether.domain.repository;

import com.example.spring_foogether.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
