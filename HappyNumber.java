package com.practice.java.learning;

import java.util.Scanner;

public class HappyNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int m1=n;
	//int sum=0;
	int k=checkHappy(n);
	System.out.println(k);
	
	while((k!=1)||(k!=m1)) {
		System.out.println(k);
		if ((k==1)||(k==m1)) {
			break;
		}
		k=checkHappy(k);
	}
	if (k==1) {
		System.out.println("Happy number");
	}
	else {
		System.out.println("Sad number");
	}
	
}
public static int checkHappy(int n) {
	int sum=0;
	while (n>0) {
		int q=n%10;
		sum+=q*q;
		n=n/10;}
	n=sum;
	return n;
}


}
