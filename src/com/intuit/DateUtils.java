package com.intuit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date = "1/1/2022";
		SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);

		Date end;
		try {
			Date parsedDate = sdf.parse(date);
			SimpleDateFormat print = new SimpleDateFormat("MMM d, yyyy HH:mm:ss");
			System.out.println(print.format(parsedDate));
			
			//end = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
			        //.parse(date);
			//System.out.println(end);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
