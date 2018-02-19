package com.practice.java.learning;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a range");
int n= sc.nextInt();
sc.close();
int i=2;
int sum=0;
while (i<=n) {
	if (isPrime(i)) {
		sum+=i;
	}
	i++;
}
System.out.println(sum);
	}

	private static boolean isPrime(int i) {
		if(i<2)
		return false;
		for (int j = 2; j <=i/2; j++) {
			if (i%j==0) {
				return false;
			}
		}
		return true;
	}

}
