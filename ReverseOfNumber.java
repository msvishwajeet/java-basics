package com.practice.java.learning;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int m=0;
sc.close();
while (n>0) {
	int nm=n%10;
	m=m*10+nm;
	n=n/10;
}
System.out.println(m);
	}

}
