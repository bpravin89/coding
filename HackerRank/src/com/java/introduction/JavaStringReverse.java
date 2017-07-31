package com.java.introduction;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		String str = "redder";
		boolean isPalindrone = true;
		
		for (int i = 0, j = str.length()-1; j > i; i++, j--) {
			
			if (str.charAt(i)!= str.charAt(j)) {
				isPalindrone = false;
				break;
			}
		}
		
		System.out.println("Input string is a Palindrome? :" + isPalindrone);
	}

}
