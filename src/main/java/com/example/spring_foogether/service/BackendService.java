package com.example.spring_foogether.service;


import com.example.spring_foogether.domain.*;
import com.example.spring_foogether.domain.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BackendService {
    private final CategoryRepository categoryRepository;
    private final ReservationRepository reservationRepository;
    private final ReservationMemberRepository reservationMemberRepository;
    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;

    public Reservation getReservation(Long reservationId) {
        return reservationRepository.findById(reservationId).get();
    }

    public Category getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    public Restaurant getRestaurant(Long restaurantId) {
        return restaurantRepository.findById(restaurantId).get();
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    public ReservationMember getReservationMember(Long reservationMemberId) {
        return reservationMemberRepository.findById(reservationMemberId).get();
    }

    public List<Category> getAllCategories() {
        List<Category> all = categoryRepository.findAll();
        return all;
    }


}
