package com.cts.patterns;

public interface FacadeChain {
	public void setNextChain(FacadeChain chain);
	public void getProductType(Product product);

}
