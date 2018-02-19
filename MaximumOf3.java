package com.practice.java.learning;

import java.util.Scanner;

public class MaximumOf3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 Number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	sc.close();
	if (a>b&&a>c) {
		System.out.println(a);
	}
	else if (b>a&&b>c) {
		System.out.println(b);
	}
	else {
		System.out.println(c);
	}
}
}
