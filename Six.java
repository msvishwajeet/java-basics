package com.practice.java.learning;

import java.util.Scanner;
//program for n natural number
public class Six {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	sc.close();
	int i=1;
	while(n>0) {
		System.out.print(i++ +" ");
		n--;
	}
}
}
