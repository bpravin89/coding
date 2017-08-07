package com.java.introduction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
					   
		String regex = "(\\<([a-zA-Z0-9]+)\\s*[^\\>]*\\>)\\1*([^\\<]+?)(</\\2)\\4*";
		
		Pattern p = Pattern.compile(regex);
		
		 Matcher m = p.matcher("<h1>had<h1>public</h1515></h1>");
		 
		 int count = 0; 
		 while (m.find()) {
			 System.out.println(m.group(3));
			 count++;
		 }
		 
		 if(count == 0){
             System.out.println("None");
        }

		//String regex = "\\b(\\w+)(\\s+\\1)+\\b";

	}

}
