package com.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			intList.add(i, scan.nextInt());			
		}
		
		int q = scan.nextInt();
		while (q > 0) {
			String s=scan.next();
			if ("Insert".equalsIgnoreCase(s)) {
				intList.add(scan.nextInt(), scan.nextInt());
			}
			else if ("Delete".equalsIgnoreCase(s)) {
				intList.remove(scan.nextInt());
			}
			
			q--;
		}
		
		for (Object object : intList) {
			System.out.print((int)object + " ");
		}
	}

}
