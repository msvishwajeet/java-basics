package com.practice.java.learning;

import java.util.Scanner;

public class SumOfFactOfIndiDigit {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter A NUMBER");
	int n=sc.nextInt();
	sc.close();
	int sum=0;
	sc.close();
	while (n>0) {
	int s=n%10;
	sum+=fact(s);
	n=n/10;
	}
	System.out.println(sum);
}

private static int fact(int s) {
	int fact=1;
	for (int i = 1; i <= s; i++) {
		fact*=i;
	}
	return fact;
}

}
