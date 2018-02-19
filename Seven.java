package com.practice.java.learning;

import java.util.Scanner;

//program to find whether a given year is leap year or not
public class Seven {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a year");
	int n=sc.nextInt();
	sc.close();
	if (n%400==0||(n%4==0&&n%100!=0)) {
		System.out.println("Leap year");
	}
	else
		System.out.println("Normal year");
}
}
