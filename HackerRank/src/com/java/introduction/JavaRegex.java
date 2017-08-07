package com.java.introduction;

import java.util.Scanner;

 class JavaRegex {

	/*public static void main(String[] args) {
		
		String regexComponent = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
		String fullStop = "\\.";
		String regex = regexComponent + fullStop + regexComponent + fullStop + regexComponent + fullStop + regexComponent;
		//String regex = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
		System.out.println("Reg Ex :" + regex);
		String pattern = "I.Am.not.an.i";
		
		System.out.println(pattern.matches(regex));

	}*/
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            //System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

 class MyRegex {

		String regexComponent = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
		String fullStop = "\\.";
		String pattern = regexComponent + fullStop + regexComponent + fullStop + regexComponent + fullStop + regexComponent;
		
	}
}

