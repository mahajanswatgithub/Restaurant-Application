package com.example.springBootRestaurantApplication.RestaurantApplication.service;

import com.example.springBootRestaurantApplication.RestaurantApplication.model.FoodSpeciality;
import com.example.springBootRestaurantApplication.RestaurantApplication.model.Restaurant;
import com.example.springBootRestaurantApplication.RestaurantApplication.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getRestaurantsList() {
        return restaurantRepo.getAllRestaurantList();
    }

    public String addRestaurantsInfo(List<Restaurant> restaurants) {
        List<Restaurant> restaurantList = getRestaurantsList();
        restaurantList.addAll(restaurants);
//        for(Restaurant restaurant : restaurantList)
//        {
//            restaurantList.add(restaurant);
//        }
        return "Restaurants Information is added!!!!";
    }

    public String add(Restaurant restaurant) {
        List<Restaurant> restaurantList = getRestaurantsList();
        restaurantList.add(restaurant);
        return "Restaurant Information is added!!!!";
    }


    public String updateRestaurantSpeciality(Integer restaurantId, FoodSpeciality foodSpeciality) {
        for(Restaurant restaurant : getRestaurantsList())
        {
            if(restaurant.getRestaurantId().equals(restaurantId))
            {
                restaurant.setFoodSpeciality(foodSpeciality);
                return "Restaurant updated for restaurant ID:" + restaurantId;
            }
        }

        return "restaurant not found restaurant ID: " + restaurantId;
    }

    public String deleteRestaurantSpeciality(Integer restaurantId) {
        List<Restaurant> restaurantList = getRestaurantsList();
        for(Restaurant restaurant : restaurantList)
        {
            if(restaurant.getRestaurantId().equals(restaurantId))
            {
                restaurantList.remove(restaurant);
                return "Restaurant deleted for restaurant ID:" + restaurantId;
            }
        }
        return "Restaurant :" + restaurantId + " not deleted as it doesn't exist" ;
    }
    public Restaurant getRestaurantInfoById(Integer restaurantId) {
        List<Restaurant> restaurantList = getRestaurantsList();
        for(Restaurant restaurant : restaurantList)
        {
            if(restaurant.getRestaurantId().equals(restaurantId))
            {
                return restaurant;
            }
        }
        throw new IllegalStateException("id not found");
    }
}
