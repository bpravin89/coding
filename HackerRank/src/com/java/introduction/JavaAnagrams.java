package com.java.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {

		char[] charArrayA = a.toLowerCase().toCharArray();
		Arrays.sort(charArrayA);
		a = new String(charArrayA);
		char[] charArrayB = b.toLowerCase().toCharArray();
		Arrays.sort(charArrayB);
		b = new String(charArrayB);

		if (a.compareTo(b) != 0)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
	
	/*
	 * public static void main(String[] args) { String str = "anagram";
	 * 
	 * char [] charArray = str.toLowerCase().toCharArray();
	 * Arrays.sort(charArray); System.out.println("Original String \n" + str);
	 * 
	 * 
	 * System.out.println(charArray); str.compareTo("")
	 * 
	 * 
	 * }
	 */

}
