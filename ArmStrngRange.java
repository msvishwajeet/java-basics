package com.practice.java.learning;

import java.util.Scanner;

public class ArmStrngRange {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enetr a Number");
int n=sc.nextInt();
//
for (int i = 1; i <= n; i++) {
	String s=i+"";
	int m=i;
	if (armStr(i,s.length())==(m)) {
		System.out.println(m);
	}
}

	}

	private static int armStr(int i, int length) {
		int sum=0;
		while (i>0) {
			sum+=mult(i%10,length);
			i=i/10;
		}
		return sum;
	}

	private static int mult(int i, int length) {
		int mul=1;
		for (int j = 0; j < length; j++) {
			mul*=i;
		}
		
		return mul;
	}

}
