package de.vogella.regex.weblinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//A phone number in this example consists either out of 7 numbers in a row or out of 3 number, a (white)space or a dash and then 4 numbers.
public class CheckPhone {

	public static void main(String[] args) {
		
//		Pattern pattern = Pattern.compile("\\d{7}|\\d{3} \\d{4}");
		 String str = "\\d\\d\\d[,\\s]?\\d\\d\\d\\d";
		Pattern pattern = Pattern.compile(str);
		
		Matcher matcher = pattern.matcher("1233323");
		
		System.out.println(matcher.matches());

	}

}
