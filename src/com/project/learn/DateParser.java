package com.project.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;


public class DateParser {
	
	public static void main(String[] args) throws ParseException {
		
		String sDate6 = "03-JUL-20 11.13.19.000000 AM"; 
		SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yy HH.mm.ss.SSSSSSS aa");
		formatter6.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		Date d1 = formatter6.parse(sDate6);
		
		DateTime da = new DateTime(d1);
		
		System.out.println(da.toString());
		
		
	}

}
