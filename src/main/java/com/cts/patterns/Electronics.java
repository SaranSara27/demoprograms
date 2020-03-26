package com.cts.patterns;

public class Electronics implements FacadeChain{
	private FacadeChain  chain;
	@Override
	public void setNextChain(FacadeChain chain) {
		this.chain = chain;
		
	}
	@Override
	public void getProductType(Product product) {
		if(product.getProductName().equals("Electronics")) {
			System.out.println("Laptop,SmartTV,MicroWave");
		}
		else {
			chain.getProductType(product);
		}
	}
}
class KitchenItems implements FacadeChain{
	private FacadeChain  chain;
	@Override
	public void setNextChain(FacadeChain chain) {
		this.chain = chain;
		
	}
	@Override
	public void getProductType(Product product) {
		if(product.getProductName().equals("KitchenItems")) {
			System.out.println("Pan,spoons, Containers");
		}
		else {
			chain.getProductType(product);
		}
	}
}


class BirthdayItems implements FacadeChain{
	private FacadeChain  chain;
	@Override
	public void setNextChain(FacadeChain chain) {
		this.chain = chain;
		
	}
	@Override
	public void getProductType(Product product) {
		if(product.getProductName().equals("BirthdayItems")) {
			System.out.println("Ballons,Candles,hats");
		}
		else {
			chain.getProductType(product);
		}
	

	}
}


