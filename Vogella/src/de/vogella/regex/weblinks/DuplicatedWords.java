package de.vogella.regex.weblinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DuplicatedWords {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("This is Is to this love bhar hate love");
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}
}
