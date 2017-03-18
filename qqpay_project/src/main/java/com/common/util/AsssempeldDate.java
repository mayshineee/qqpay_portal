package com.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AsssempeldDate {
	
	public static String assempldDate(int year,int month, int day){
		String date = "";
		date += year+"-"+month+"-"+day;  
		return date;
	}
	
	public static String getNowDate(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String nowDate = df.format(date);
		return nowDate;
	}
	
	public static int getYear(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		return cd.get(Calendar.YEAR);
	}
	public static int getMonth(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		return cd.get(Calendar.MONTH)+1;
	}
	public static int getDay(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		return cd.get(Calendar.DAY_OF_MONTH);
	}
}
