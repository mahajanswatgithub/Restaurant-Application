package com.example.springBootRestaurantApplication.RestaurantApplication.controller;

import com.example.springBootRestaurantApplication.RestaurantApplication.model.FoodSpeciality;
import com.example.springBootRestaurantApplication.RestaurantApplication.model.Restaurant;
import com.example.springBootRestaurantApplication.RestaurantApplication.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    //get all the Information of the Restaurant
    @GetMapping("restaurants")
    public List<Restaurant> getRestaurants()
    {
        return restaurantService.getRestaurantsList();
    }

    //add restaurant Information in the form of List
    @PostMapping("restaurants")
    public String addRestaurants(@RequestBody List<Restaurant> restaurants)
    {
        return restaurantService.addRestaurantsInfo(restaurants);
    }

    //add a single Restaurant Information
    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant)
    {
        return restaurantService.add(restaurant);
    }

    //update Restaurant food Speciality by providing its ID
    @PutMapping("speciality/{restaurantId}/{foodSpeciality}")
    public String updateRestaurant(@PathVariable Integer restaurantId,@PathVariable FoodSpeciality foodSpeciality)
    {
        return restaurantService.updateRestaurantSpeciality(restaurantId,foodSpeciality);
    }

    //Delete Restaurant Information by providing Id
    @DeleteMapping("remove/{restaurantId}")
    public String deleteRestaurant(@PathVariable Integer restaurantId)
    {
        return restaurantService.deleteRestaurantSpeciality(restaurantId);
    }

    //get the Specific Restaurant information by passing Id
    @GetMapping("getInfoById/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable Integer restaurantId)
    {
        return restaurantService.getRestaurantInfoById(restaurantId);
    }
}
