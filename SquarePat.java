package com.practice.java.learning;

import java.util.Scanner;

public class SquarePat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	/*for (int i = 0; i <n ; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}*/
	/*for (int i = 0; i <n ; i++) {
		for (int j = 0; j < n; j++) {
			if (i==0||j==0||(i==n-1)||(j==n-1)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}*/
	/*for (int i = 0; i <n ; i++) {
		for (int j = 0; j < n; j++) {
			if (j<=i) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}*/
	/*for (int i = 0; i <n ; i++) {
		for (int j = 0; j < n; j++) {
			if (j==0||(i==n-1)||(i==j)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}*/
	for (int i = 0; i <n ; i++) {
		for (int j = 0; j < n; j++) {
			if (j==n-1||(i==n-1)||(i+j==n-1)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
}
}
