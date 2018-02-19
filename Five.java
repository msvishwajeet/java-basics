package com.practice.java.learning;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Two number to find their remainder");
int dividend=sc.nextInt();
System.out.println("Enter second number");
int divisor=sc.nextInt();
sc.close();
//int rem=a-a/b*b;
int rem=dividend-divisor*(dividend/divisor);
//int rem=dividend*(dividend/divisor)-divisor;
System.out.println(rem);
System.out.println(dividend%divisor);
	}

}
