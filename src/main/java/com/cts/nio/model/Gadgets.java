package com.cts.nio.model;

public class Gadgets {
	
	private int  gadgetId;
	private String gadgetName;
	private double price;
	private String gadgetType;
	public Gadgets() {
		super();
	}
	public Gadgets(int gadgetId, String gadgetName, double price, String gadgetType) {
		super();
		this.gadgetId = gadgetId;
		this.gadgetName = gadgetName;
		this.price = price;
		this.gadgetType = gadgetType;
	}
	public int getGadgetId() {
		return gadgetId;
	}
	public void setGadgetId(int gadgetId) {
		this.gadgetId = gadgetId;
	}
	public String getGadgetName() {
		return gadgetName;
	}
	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGadgetType() {
		return gadgetType;
	}
	public void setGadgetType(String gadgetType) {
		this.gadgetType = gadgetType;
	}
	@Override
	public String toString() {
		return "Gadgets [gadgetId=" + gadgetId + ", gadgetName=" + gadgetName + ", price=" + price + ", gadgetType="
				+ gadgetType + "]";
	}
	
	

}
