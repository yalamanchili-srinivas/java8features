package com.example.java8features.collectioswithlambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeEx {
	public static void main(String[] args){
		//Current date and time
		LocalDate date=LocalDate.now();
		System.out.println("Date "+date);
		LocalTime time=LocalTime.now();
		System.out.println("Time "+time);

		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		System.out.println(dd+".."+mm+".."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);



		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,n);

		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println("After 6 months :"+dt.plusMonths(6));
		System.out.println("Before 6 months :"+dt.minusMonths(6));
	}
}
