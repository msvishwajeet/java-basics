package com.practice.java.learning;

import java.util.Scanner;

public class SumOfSqrOfIndiDigit {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	sc.close();
	int sum=0;
	while (n>0) {
		int s=n%10;
		sum+=(s*s);
		n=n/10;
	}
	System.out.println(sum);
}
}
