package com.practice.java.learning;

import java.util.Scanner;

public class FirstNEvenNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int i=1;
	sc.close();
	while(i<=n) {
		if (i%2==0) {
			System.out.println(i);
		}
		i++;
	}
}
}
