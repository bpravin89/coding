package com.java.introduction;

import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String weekdays[] = dfs.getWeekdays();
        
        Calendar cal  = Calendar.getInstance();
        cal.clear();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) -1, Integer.parseInt(day));
        
        /*System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        //System.out.println(dayOfWeeks[cal.get(Calendar.DAY_OF_WEEK) -1 ]);
        
        System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());*/
        
        System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());
	}

}
