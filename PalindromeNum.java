package com.practice.java.learning;

import java.util.Scanner;

public class PalindromeNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	sc.close();
	int n1=n;
	int mn=0;
	while (n1>0) {
		int k=n1%10;
		mn=mn*10+k;
		n1=n1/10;
	}
	System.out.println(mn);
	if (n==mn) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
