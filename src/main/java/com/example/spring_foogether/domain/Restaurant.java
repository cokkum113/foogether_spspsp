package com.example.spring_foogether.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "food")
    private String food;

    @Column(name = "food_img")
    private String food_img;

    @Column(name = "restaurant_name")
    private String restaurant_name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "menu_img")
    private String menu_img;

    @Column(name = "max_cnt")
    private Long max_cnt;

    @Column(name = "restaurant_s_desc")
    private String restaurant_s_desc;

    @Column(name = "restaurant_desc")
    private String restaurant_desc;

    @Column(name = "location")
    private String location;

    @OneToMany(mappedBy = "restaurant")
    private List<Reservation> reservations = new ArrayList<>();





}
