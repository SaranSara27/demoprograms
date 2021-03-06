package com.cts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DataRepo {
	
	public static int[]  grades = {23,14,43,32,26};
	
	public static List<String> collegeNames = Arrays.asList(new String[] {
		"BITS","RMK","MALAR","MITS","RNSIT","IIT"
	});
	
	public static List<Student> studentList = Arrays.asList(new Student[] {
			new Student(103,"Anne","Anne@gmail.com",66.66,new Branch(555,"CS")),
		new Student(101,"Ayaan","Ayaan@gmail.com",96.08,new Branch(111,"EC")),
		new Student(106,"Smitha","Smith@gmail.com",76.76,new Branch(333,"CS")),
		new Student(105,"Mason","Mason@gmail.com",45.09,new Branch(222,"CS")),
		new Student(102,"Mikea","Mike@gmail.com",35.12,new Branch(444,"EC")),
		new Student(104,"Sam","Sam@gmail.com",56.35,new Branch(666,"EC")),
		
		
	});
	
	public static Optional<Student> getStudentById(int id){
		return studentList.stream().filter(s->s.getStudentId()==id).findAny();
	}
	
	
	
	
	

}
