package com.cts.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class RestaurantAppImpl {
	public static void main(String[] args) {
		List<Restuarant> restaurantList = Arrays.asList(new Restuarant[] {
			new  Restuarant(111,"Beijing Bytes","Chinese","RT Nagar"),
			new  Restuarant(333,"UdupiGarden","Indian","Kormangala"),
			new  Restuarant(222,"MainLandChina","Chinese","BTM"),
			new  Restuarant(555,"Savana Bhavan","Indian","RT Nagar"),
			new  Restuarant(444,"VidhnuPark","Indian","Silk Board"),
		});
//		Collections.sort(restaurantList, new Comparator<Restuarant>() {
//			@Override
//			public int compare(Restuarant r1, Restuarant r2) {
//				return r1.getRestaurantName().compareTo(r2.getRestaurantName());
//			}
//		});
//		for (Restuarant restuarant : restaurantList) {
//			System.out.println(restuarant);
//		}
		

//		Collections.sort(restaurantList, (r1,r2)-> r1.getRestaurantName().compareTo(r2.getRestaurantName()));
//		restaurantList.forEach(r->System.out.println(r));
		
		
		Predicate<Restuarant> predicate  = (r)->r.getFoodType().equals("Indian");
		displayBasedOnFoodType(restaurantList,predicate);
}

	private static void displayBasedOnFoodType(List<Restuarant> restaurantList, Predicate<Restuarant> predicate) {
		for (Restuarant restuarant : restaurantList) {
			if(predicate.test(restuarant)) {
				System.out.println(restuarant);
			}
		}
		
	}

}
