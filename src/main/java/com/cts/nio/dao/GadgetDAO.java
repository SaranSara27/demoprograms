package com.cts.nio.dao;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cts.nio.model.Gadgets;

public class GadgetDAO {
	static Path path = Paths.get("dir","gadgetData.csv");
	
	
	public static List<String[]> readingFromFile(){
		List<String[]> listData = null;
		try(Stream<String> fileData = Files.lines(path)){
			listData =fileData.map(input->{
				String[] row = input.split(",");
						return row;
			}).collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listData;
	}
	
	public static List<Gadgets> getGadgetData(){
		List<Gadgets> gadgetList = null;
		try(Stream<String> bufferData = Files.newBufferedReader(path).lines()){
			gadgetList = bufferData.map(GadgetDAO::getGadget)
			.collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return gadgetList;
	}
	
	public static Gadgets getGadget(String  data) {
		String[] input = data.split(",");
		return new Gadgets(Integer.parseInt(input[0]),input[1],Double.parseDouble(input[2]),input[3]);
		
	}
	public static void recieveData() {
		try {
			List<String> dataList = Files.readAllLines(path);
			Files.write(Paths.get("dir","copyGadget.csv"),dataList , StandardOpenOption.CREATE);
		
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}
	public static void writingIntoPropertiesFile() {
		List<Gadgets> gadgetData = getGadgetData();
		Properties prop = new Properties();
		for (Gadgets gadgets : gadgetData) {
			prop.setProperty(String.valueOf(gadgets.getGadgetId()), gadgets.getGadgetName());
		}
		BufferedWriter buffer;
		try {
			buffer = Files.newBufferedWriter(Paths.get("dir","gadget.properties"), StandardOpenOption.CREATE);
			prop.store(buffer,"Gadget Data Updated");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Task Completed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
