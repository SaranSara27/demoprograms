package com.cts.streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WorkingWithStreams {
	public static void main(String[] args) {
		
		
//		Arrays.stream(DataRepo.grades)//Convert  Array to a Stream
//		.filter(g->g%2==0)//i1
//		.sorted()//i2
//		.forEach(s->System.out.println(s));//Terminal
		
		
//		long count = DataRepo.collegeNames.stream() //List to a  Stream
//		.filter(s->s.endsWith("IT"))
//		.sorted()
//		.count();
//		
//		System.out.println("Count "+count);
		
		
//		DataRepo.studentList.stream()
//		.filter(s->s.getBranch().getBranchname().equals("CS"))
//		.filter(s->s.getStudentId()<=105)
//	//	.sorted((s1,s2)->s1.getStudentId()-s2.getStudentId())
//		.sorted((s1,s2)->s2.getStudentName().compareTo(s1.getStudentName()))//Stream of Student
//		//.map(s->s.getStudentName())//Stream of String
//		.mapToInt(s->s.getStudentId())
//		.forEach(s->System.out.println(s));
		
//		LinkedHashSet<Student> studentList = DataRepo.studentList.stream()
//		.filter(s->s.getStudentId()<=105)
//		.sorted((s1,s2)->s1.getStudentName().compareTo(s2.getStudentName()))
//		//.collect(Collectors.toList());
//		//.collect(Collectors.toCollection(()->new LinkedList()));
//		.collect(Collectors.toCollection(()->new LinkedHashSet()));
//		studentList.forEach(s->System.out.println(s));
		
		
		
		Map<String,Branch> mapData = DataRepo.studentList.stream()
		.filter(s->s.getStudentId()<=105)
		//.sorted((s1,s2)->s1.getStudentName().compareTo(s2.getStudentName()))
		.collect(Collectors.toMap(s->s.getStudentName(),s->s.getBranch()));
		
		
		System.out.println(mapData);
		
		
		
		
		DoubleSummaryStatistics stats = DataRepo.studentList.stream()
		.mapToDouble(s->s.getGrade())
		.summaryStatistics();
		
		System.out.println(stats.getAverage());
		
		
		System.out.println(DataRepo.getStudentById(103));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
