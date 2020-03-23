package com.cts.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestFilesPath {

	public static void main(String[] args) {
		Path path = Paths.get("dir","subdir","newFile.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getFileName()+" "+path.getParent());
		
		
//		System.out.println("*********************List()**********************");
//		try(Stream<Path> paths = Files.list(Paths.get("dir"))){
//			paths.forEach(System.out::println);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println("******************Walk()***********************");
		try(Stream<Path> pathObjects = Files.walk(Paths.get("dir"))){
			pathObjects.filter(Files::isRegularFile)
			.filter(f->f.toString().endsWith(".csv"))
			.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
