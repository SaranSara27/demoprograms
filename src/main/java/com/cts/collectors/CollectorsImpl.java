package com.cts.collectors;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cts.streams.DataRepo;
import com.cts.streams.Student;

public class CollectorsImpl {
	public static void main(String[] args) {
		String collegeNames = DataRepo.collegeNames.stream()
		.collect(Collectors.joining(",", "{ CollegeNames : ", "}"));
		System.out.println(collegeNames);
		
		String studentNames = DataRepo.studentList.stream()
		.map(Student::getStudentName)
		.collect(Collectors.joining(" * ","[ "," ]"));
		
		
//		long count = DataRepo.studentList.stream()
//				.map(Student::getStudentName)
//				.collect(Collectors.counting());
//		System.out.println("Count "+count);
		
		
//		DoubleSummaryStatistics stats = DataRepo.studentList.stream()
//		.collect(Collectors.summarizingDouble(s->s.getGrade()));
//		System.out.println(stats.getAverage());
		
		
		Optional<Student> optStudent = DataRepo.studentList.stream()
		.collect(Collectors.minBy(Comparator.comparing(Student::getGrade)));
		optStudent.ifPresent(System.out::println);
		
		//Reduce  Implementation
		Double data = DataRepo.studentList.stream()
		.map(Student::getGrade)
		.reduce((a,v)->a+v).get();
		System.out.println(data);
		
		
		
//		Map<String,String> groupByData = DataRepo.studentList.stream()
//		.collect(
//				Collectors.groupingBy(s->s.getBranch().getBranchname()
//						,Collectors.mapping(Student::getStudentName,Collectors.joining(","))
//						));
//		
//		System.out.println(groupByData);
		
		Map<Integer,String> mapData = DataRepo.studentList.stream()
		.collect(Collectors.toMap(Student::getStudentId, Student::getStudentName));
		
		
		Stream<Entry<Integer,String>> sortedMapData = mapData.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()));
		sortedMapData.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
