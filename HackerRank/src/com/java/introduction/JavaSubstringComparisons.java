package com.java.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		
		List<String> strList = new ArrayList<String>();

		for (int index = 0; index < s.length(); index++) {

			int temp = index + 1;
			
			while (temp <= s.length()) {
				
				String subStr = s.substring(index, temp);
				if (subStr.length() == k) {
					strList.add(subStr);
				}
				temp++;
			}
		}
		
		Collections.sort(strList);
		
		smallest = strList.get(0);
		largest = strList.get(strList.size()-1);

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length
		// 'k'
		// 'largest' must be the lexicographically largest substring of length
		// 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
