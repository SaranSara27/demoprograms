package com.cts.lambdas;

public class FunctionalInterfaceImpl implements SeasonalFruit,OrganicFruits{

	public static void main(String[] args) {
		FunctionalInterfaceImpl fruit = new FunctionalInterfaceImpl();
		System.out.println("****************Sessonal Fruit*****************");
		System.out.println("Season() "+fruit.season());
		System.out.println("fruitType "+fruit.fruitType());
		SeasonalFruit.testFruit();
		System.out.println("****************Organic Fruit*****************");
		OrganicFruits.testFruit();
		//System.out.println("fruitType "+fruit.fruitType());
	}

	@Override
	public String season() {
		
		return "April";
	}

	@Override
	public String fruitType() {
		return SeasonalFruit.super.fruitType();
	}

}
