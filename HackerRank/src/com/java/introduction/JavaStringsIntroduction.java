package com.java.introduction;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int sum = A.length() + B.length();
	        System.out.println(sum);
	        
	        if (A.compareTo(B) > 0) {
				System.out.println("Yes");
			}
	        else{
	        	System.out.println("No");
	        }
	        
	        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) +  B.substring(1));
	        
	}

}
