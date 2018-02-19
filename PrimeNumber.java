package com.practice.java.learning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
sc.close();
if (isPrime(n)) {
	System.out.println("Prime number");
}
else {
	System.out.println("Not a prime number");
}
	}

	private static boolean isPrime(int n) {
		if (n<2) {
			return false;
		}
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}
