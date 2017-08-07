package com.java.introduction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2 {

	public static void main(String[] args) {
		String inputSequence = "i love to to love code code";
		
		Pattern p = Pattern.compile("\\b[a-zA-z]*\\b");
		
		Matcher matcher = p.matcher(inputSequence);
		
		StringBuffer sb = new StringBuffer(inputSequence.length());
		while (matcher.find()) {
			
			//System.out.println("true");
		}
		
		//System.out.println("a b".length());
		System.out.println("adnsdcsdcc".matches("[a-zA-Z]*"));

	}

}
