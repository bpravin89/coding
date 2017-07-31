package com.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	private static boolean flag = false;
	private static int B;
	private static int H;
	private static Scanner sc = new Scanner(System.in);
	static
	{
	         B = sc.nextInt();
	         H = sc.nextInt();

	        if(B > 0 && B <= 100 &&  H > 0 && H <= 100)
	        {
	            flag = true;
	        }
	        
	        if (!flag) {
	        	System.out.println("java.lang.Exception: Breadth and height must be positive");
			}

	}
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}
