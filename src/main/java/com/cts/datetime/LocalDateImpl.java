package com.cts.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateImpl {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today "+today.isLeapYear());
		
		LocalDate saturday = LocalDate.of(2020,Month.MARCH,28);
		System.out.println("Saturday "+saturday);
		
		//Converting String to Date
		
		String tomorrow = "25-03-2020";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd-MM-yyyy]");
		LocalDate tomorrowsDate = LocalDate.parse(tomorrow, format);
		System.out.println("Tomorrow "+tomorrowsDate);
		
		//Comparing Dates
		System.out.println("Before "+today.isBefore(tomorrowsDate));
		System.out.println("After "+today.isAfter(tomorrowsDate));
		System.out.println("Compare To "+today.compareTo(tomorrowsDate));
		
		//Date Mainpulations
		//today.plusYears(1).plusMonths(3).plusDays(2);
		LocalDate add1Y3M2D = today.plus(1,ChronoUnit.YEARS).plus(3,ChronoUnit.MONTHS)
				.plus(2,ChronoUnit.DAYS);
		System.out.println("add1Y3M2D "+add1Y3M2D);
		
		
		LocalDate minus1Y3M2D = add1Y3M2D.minusYears(1).minusMonths(3).minusDays(2);
		System.out.println("minus1Y3M2D "+minus1Y3M2D);
		
		//Differences between two dates
		
		Period period =  Period.between(today, add1Y3M2D);
		System.out.println("Period  "+period);
		System.out.println("Period Object  "+Period.of(2020, 05, 15));
		
		//Temporal Adjusters
		
		LocalDate adjuster = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		
		System.out.println(adjuster);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
