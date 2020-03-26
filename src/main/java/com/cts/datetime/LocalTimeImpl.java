package com.cts.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeImpl {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("currentTime "+currentTime);
		
		LocalTime afternoon = LocalTime.of(14, 30,30);
		System.out.println("Afternoon "+afternoon);
		
		String evening  = "05:30:20";
		LocalTime eve = LocalTime.parse(evening);
		System.out.println("evening  "+eve);
		
		LocalTime add3H4M5S = currentTime.plusHours(3).plusMinutes(4).plus(5,ChronoUnit.SECONDS);
		System.out.println("add3H12M5S "+add3H4M5S);
		
		LocalTime minnus3H4M5S = add3H4M5S.minus(3,ChronoUnit.HOURS).minusMinutes(4).minusSeconds(5);
		System.out.println("minnus3H4M5S "+minnus3H4M5S);
		
		Duration duration  = Duration.between(currentTime, add3H4M5S);
		System.out.println("Duration "+duration);
		
		LocalDateTime  datetime = LocalDateTime.now();
		System.out.println("Date and Time "+datetime);
		
		LocalDateTime result  = LocalDateTime.of(2020, 03, 27, 10, 30);
		System.out.println("Result "+result);
		
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("currentZone "+currentZone);
		
		
		//ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		
		ZoneId zoneId = ZoneId.of("US/Pacific");
		ZonedDateTime zonedDateTime =  ZonedDateTime.now(zoneId);
		System.out.println("America/Costa_Rica "+zonedDateTime);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
