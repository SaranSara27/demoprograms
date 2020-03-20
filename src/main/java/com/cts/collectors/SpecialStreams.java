package com.cts.collectors;

import java.util.stream.Stream;

public class SpecialStreams {

	public static void main(String[] args) {
		//Iterate 
		Stream.iterate(10, n->n+2).limit(5).forEach(System.out::println);
		
		//Generate
		System.out.println("*************Generate()*******************");
		Stream.generate(Math::random).limit(5).forEach(System.out::println);

	}

}
