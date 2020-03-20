package com.cts.collectors;

import java.util.Optional;

import com.cts.streams.Branch;
import com.cts.streams.DataRepo;
import com.cts.streams.Student;

public class OptionalImpl {

	public static void main(String[] args) {
//		Optional<String> emptyOptional = Optional.empty();
//		Student student = new Student();
//		System.out.println(Optional.of(student));
//		student = null;
//		System.out.println(Optional.ofNullable(student));
		System.out.println("***********Optional()**************");
		Optional<Student> studentOpt = DataRepo.getStudentById(103);
//		studentOpt.ifPresent(System.out::println);
		//Student student = studentOpt.orElse(new Student(109,"John","John@gmail.com",56.35,new Branch(777,"EC")));
		
		//System.out.println(student);
	//	studentOpt.orElseThrow(StudentNotFound::new);
		
		if(studentOpt.isPresent()) {
			System.out.println(studentOpt.get());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
