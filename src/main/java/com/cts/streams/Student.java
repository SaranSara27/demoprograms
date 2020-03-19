package com.cts.streams;

public class Student {
	private int studentId;
	private String studentName;
	private String email;
	private double grade;
	public Student(int studentId, String studentName, String email, double grade, Branch branch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.grade = grade;
		this.branch = branch;
	}
	private Branch branch;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String email, Branch branch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.branch = branch;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", grade="
				+ grade + ", branch=" + branch + "]";
	}
	
	

}
