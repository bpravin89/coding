package com.java.introduction;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		// Write your code here.
		String[] split = s.split("[ !,?._'@]");
		scan.close();
		
		if (s.length() > 400000) {
			return;
		}
		System.out.println(split.length);
		
		for (String string : split) {
			System.out.println(string);
		}
	}

}
