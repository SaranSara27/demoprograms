package com.cts.lambdas;
@FunctionalInterface
public interface SeasonalFruit {
	public String season();
	default String fruitType() {
		return "Mango";
	}
	public static void testFruit() {
		System.out.println("SeasonalFruit::testFruit");
	}

}
interface OrganicFruits{
	public String season();
	default String fruitType() {
		return "Apple";
	}
	public static void testFruit() {
		System.out.println("OrganicFruits::testFruit");
	}
}
