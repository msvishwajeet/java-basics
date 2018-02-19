package com.practice.java.learning;

import java.util.Scanner;

public class PrimeWithInRange {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Starting Number");
int s=sc.nextInt();
System.out.println("Enter the ending Number");
int e=sc.nextInt();
while (s<=e) {
	if (isPrime(s)) {
		System.out.print(s+" ");
	}
	s++;
}
	}

	private static boolean isPrime(int s) {
		if (s<2) {
			return false;
		}
		for (int i = 2; i <=s/2; i++) {
			if (s%i==0) {
				return false;
			}
		}
		return true;
	}

}
