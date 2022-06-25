package com.example.spring_foogether.controller;

import com.example.spring_foogether.domain.*;
import com.example.spring_foogether.service.BackendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/foogether")
public class BackendController {
    private final BackendService backendService;

    @GetMapping("")
    public List<Category> getAllCategories() {
        return backendService.getAllCategories();
    }

    @GetMapping("/{reservationId}")
    public Reservation getReservation(@PathVariable Long reservationId) {
        return backendService.getReservation(reservationId);
    }

    @GetMapping("/category/{categoryId}")
    public Category getCategory(@PathVariable Long categoryId) {
        return backendService.getCategory(categoryId);
    }

    @GetMapping("/res/{restaurantId}")
    public Restaurant getRestaurant(@PathVariable Long restaurantId) {
        return backendService.getRestaurant(restaurantId);
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable Long userId) {
        return backendService.getUser(userId);
    }

    @GetMapping("/rm/{reservationMemberId}")
    public ReservationMember getReservationMember(@PathVariable Long reservationMemberId) {
        return backendService.getReservationMember(reservationMemberId);
    }
}
