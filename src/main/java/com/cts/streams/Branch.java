package com.cts.streams;
//EC,CS
public class Branch {
	private int branchId;
	private String branchname;
	public Branch() {
		super();
	}
	public Branch(int branchId, String branchname) {
		super();
		this.branchId = branchId;
		this.branchname = branchname;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchname=" + branchname + "]";
	}
	
	

}
