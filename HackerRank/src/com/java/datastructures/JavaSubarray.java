package com.java.datastructures;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int myArr[] = new int[length];
		
		for(int i = 0 ; i < length; i++){
			myArr[i] = scan.nextInt();
        }

		int negArrCount = 0;
		for (int i = 0; i < myArr.length; i++) {

			int sum = myArr[i];
			if (sum < 0) {
				negArrCount ++;
			}
			
			int j = i + 1;
			
			while (j < length) {
				
				sum = sum + myArr[j];
				if (sum < 0) {
					negArrCount ++;
				}
				j++;
			}
			
			
		}
		
		System.out.println(negArrCount);

	}

}
