package com.practice.java.learning;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int k=n;
//int sum=0;
if (strong(n)==k) {
	System.out.println("Strong Number");
}
else {
	System.out.println("Not a Strong NUmber");
}
	}

	private static int strong(int n) {
		int sum=0;
		while (n>0) {
			sum=sum+fact(n%10);
			n=n/10;
		}
		return sum;
	}

	private static int fact(int i) {
		int mul=1;
		for (int j = 1; j <= i; j++) {
			mul*=j;
		}
		return mul;
	}

}
