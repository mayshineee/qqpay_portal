package qqpay_project;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date da = new Date();
		DateFormat df = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println("今天:" + df.format(new Date()));
		System.out.println(da.toString());
		Calendar cd = Calendar.getInstance();
		cd.setTime(da);
		System.out.println(cd.toString());
		System.out.println(cd.get(Calendar.YEAR));

		// 一年中的第一个月是 JANUARY，它为 0
		System.out.println(cd.get(Calendar.MONTH));
		System.out.println(cd.get(Calendar.DAY_OF_WEEK));
		System.out.println(cd.get(Calendar.DAY_OF_MONTH));
		System.out.println(cd.get(Calendar.DAY_OF_YEAR));
		System.out.println(
				cd.get(Calendar.YEAR) + "/" + (cd.get(Calendar.MONTH) + 1) + "/" + cd.get(Calendar.DAY_OF_MONTH) + " "
						+ cd.get(Calendar.HOUR_OF_DAY) + ":" + cd.get(Calendar.MINUTE) + ":" + cd.get(Calendar.SECOND));
		Date dt = cd.getTime();
		System.out.println(dt.toString());
		
		Date date = new Date();
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		String dd = df1.format(date);
		System.out.println(dd);
	}

}
