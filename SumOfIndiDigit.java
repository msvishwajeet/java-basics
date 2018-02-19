package com.practice.java.learning;

import java.util.Scanner;

public class SumOfIndiDigit {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int sum=0;
	sc.close();
	while (n>0) {
		sum+=n%10;
		n=n/10;
	}
	System.out.println(sum);
	}
}
