package com.java.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayPart2 {

	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.

		int i = 0;

		return checkIfWin(i, game, leap);
	}

	public static boolean checkIfWin(int index, int[] array, int leap) {

		if (index + leap >= array.length) {
			return true;
		}
		else if (array[index+leap] == 0) {
			
			int tempIndex = index+leap;
			
			while (array[tempIndex - 1] == 0 && tempIndex >= index + 2) {
				tempIndex -- ;
				
			}
			return checkIfWin(tempIndex, array, leap);
		}
		else if (array[index+1] == 0) {
			return checkIfWin(index+1, array, leap);
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

}
