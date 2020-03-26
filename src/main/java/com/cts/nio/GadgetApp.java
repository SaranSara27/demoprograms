package com.cts.nio;

import java.util.List;

import com.cts.nio.dao.GadgetDAO;

public class GadgetApp {

	public static void main(String[] args) {
//		List<String[]> data = GadgetDAO.readingFromFile();
//		for (String[] gadget : data) {
//			System.out.println(gadget[0]+" "+gadget[1]+" "+gadget[2]+" "+gadget[3]);
//		}
		
//		GadgetDAO.getGadgetData().stream()
//		.filter(g->g.getGadgetType().equals("Laptop"))
//		.sorted((g1,g2)->g1.getGadgetName().compareTo(g2.getGadgetName()))
//		.forEach(System.out::println);
		GadgetDAO.writingIntoPropertiesFile();
		
		
	}

}
