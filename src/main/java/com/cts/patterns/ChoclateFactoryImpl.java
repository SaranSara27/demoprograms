package com.cts.patterns;

public class ChoclateFactoryImpl {
	public static void main(String[] args) {
		Choclate choclate = ChoclateFactory.getChoclateInstance("Bounty");
		System.out.println("Type "+choclate.getChoclateType());
	}

}
interface Choclate{
	public String getChoclateType();
}
class Bounty implements Choclate{
	@Override
	public String getChoclateType() {
		return "Bounty";
	}
}
class Galaxy implements Choclate{
	@Override
	public String getChoclateType() {
		return "Galaxy";
	}
}
class ChoclateFactory{
	static Choclate choclate = null;
	 static Choclate getChoclateInstance(String type) {
		if(type==null)
			choclate=null;
		if(type.equals("Bounty"))
			choclate= new Bounty();
		if(type.equals("Galaxy"))
			choclate= new Galaxy();
		return  choclate;
	}
}










