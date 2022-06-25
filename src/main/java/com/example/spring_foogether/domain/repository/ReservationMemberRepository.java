package com.example.spring_foogether.domain.repository;

import com.example.spring_foogether.domain.ReservationMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationMemberRepository extends JpaRepository<ReservationMember, Long> {
}
