package com.cts.patterns;

public class Product {
	private String productName;
	private String productPrice;
	public Product() {
		super();
	}
	public Product(String productName, String productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	

}
