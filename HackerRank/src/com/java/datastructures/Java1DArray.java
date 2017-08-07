package com.java.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
						+ arr[i + 1][j + 1] +
						arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
						
				
				if (sum > maxSum) {
					maxSum = sum;
				}
				
			}
		}
		
		System.out.println(maxSum);
		
		/*Arrays.sort(sum);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + " ");
		}
		System.out.println();
		System.out.println(sum[sum.length -1]);*/
	}

	/*
	 * public static void main(String[] args) { int[][] myArray = new int[5][5];
	 * 
	 * for (int i = 0; i < 5; i++) {
	 * 
	 * for (int j = 0; j < 5; j++) { myArray[i][j] = 0;
	 * System.out.print(myArray[i][i] + " "); } System.out.println(); }
	 * System.out.println(myArray.length);
	 * 
	 * }
	 */

}
