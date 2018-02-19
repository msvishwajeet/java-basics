package com.practice.java.learning;

import java.util.Scanner;

public class SumOfEvenAndOddDigitInANum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	sc.close();
	int oddSum=0;
	int evenSum=0;
	while (n>0) {
		int chec=n%10;
		if (chec%2==0) {
			evenSum+=chec;
		}
		else {
			oddSum+=chec;
		}
		n=n/10;
	}
	System.out.println("Odd sum==>"+oddSum);
	System.out.println("Even sum ===>"+evenSum);
}
}
