package com.practice.java.learning;

import java.util.Scanner;

public class NumberOfOddAndEvenInGivenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n= sc.nextInt();
	sc.close();
	int odd=0;
	int even=0;
	while (n>0) {
		int che=n%10;
		if (che%2==0) {
			even++;
		}
		else {
			odd++;
		}
		n=n/10;
	}
	System.out.println("Number of odd="+odd+"Even number="+even);
}
}
