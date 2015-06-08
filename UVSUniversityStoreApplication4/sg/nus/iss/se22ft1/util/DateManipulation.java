package sg.nus.iss.se22ft1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulation {
	public static Date getDateFromString(String s){
		Date date = new Date();
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
		return date;
	}

	public static String getStringFromDate(Date d){
		String str = new SimpleDateFormat("yyyy-MM-dd").format(d);
		return str;
	}
}
