package com.practice.java.learning;

import java.util.Scanner;

public class SumOfCubeOfIndiDigit {
public static void main(String[] args) {
	Scanner ac=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=ac.nextInt();
	ac.close();
	int sum=0;
	while (n>0) {
	int s=n%10;
	sum+=(s*s*s);
	n=n/10;
	
	}
	System.out.println(sum);
}
}
