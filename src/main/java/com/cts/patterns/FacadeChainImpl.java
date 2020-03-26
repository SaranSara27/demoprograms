package com.cts.patterns;

public class FacadeChainImpl {

	public static void main(String[] args) {
		FacadeChain electronics = new Electronics();
		FacadeChain kitchenItems = new KitchenItems();
		FacadeChain birthdayItems = new BirthdayItems();
		//Chaining
		
		electronics.setNextChain(kitchenItems);
		kitchenItems.setNextChain(birthdayItems);
		birthdayItems.setNextChain(electronics);
		
		Product product = new  Product("BirthdayItems","87345.3");
		electronics.getProductType(product);
		
		
	}

}
