package com.java.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfLines = scan.nextInt();
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for (int i = 0; i < noOfLines; i++) {
			int arrLength = scan.nextInt();
			 int[] array = new int[arrLength];
			 for (int j = 0; j < array.length; j++) {
				array[j] = scan.nextInt();
			}
			 list.add(array);
		}


		int noOfQueries = scan.nextInt();
		
		for (int i = 0; i < noOfQueries; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int[] retrievedArr = (int[]) list.get(x-1);
			try {
				System.out.println(retrievedArr[y-1]);
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
			
			
		}
	}

}
