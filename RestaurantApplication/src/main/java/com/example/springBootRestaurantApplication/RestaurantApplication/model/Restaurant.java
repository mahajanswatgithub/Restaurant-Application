package com.example.springBootRestaurantApplication.RestaurantApplication.model;

public class Restaurant {
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private FoodSpeciality foodSpeciality;
    private String restaurantNumber;
    private Integer totalStaff;
    private Integer staffSalary;
    private Integer foodRate;

    public Restaurant() {
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public FoodSpeciality getFoodSpeciality() {
        return foodSpeciality;
    }

    public void setFoodSpeciality(FoodSpeciality foodSpeciality) {
        this.foodSpeciality = foodSpeciality;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public Integer getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Integer totalStaff) {
        this.totalStaff = totalStaff;
    }

    public Integer getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(Integer staffSalary) {
        this.staffSalary = staffSalary;
    }

    public Integer getFoodRate() {
        return foodRate;
    }

    public void setFoodRate(Integer foodRate) {
        this.foodRate = foodRate;
    }
}
