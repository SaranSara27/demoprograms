package com.cts.lambdas;

public class Restuarant {
	private int restauranId;
	private String restaurantName;
	private String foodType;
	private String location;
	public Restuarant() {
		super();
	}
	public Restuarant(int restauranId, String restaurantName, String foodType, String location) {
		super();
		this.restauranId = restauranId;
		this.restaurantName = restaurantName;
		this.foodType = foodType;
		this.location = location;
	}
	public int getRestauranId() {
		return restauranId;
	}
	public void setRestauranId(int restauranId) {
		this.restauranId = restauranId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Restuarant [restauranId=" + restauranId + ", restaurantName=" + restaurantName + ", foodType="
				+ foodType + ", location=" + location + "]";
	}
	

}
