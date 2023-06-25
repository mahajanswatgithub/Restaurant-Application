package com.example.springBootRestaurantApplication.RestaurantApplication.repository;

import com.example.springBootRestaurantApplication.RestaurantApplication.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> getAllRestaurantList() {
        return restaurantList;
    }


}
