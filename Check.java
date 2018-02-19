package com.practice.java.learning;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
sc.close();
int s=0;
while (n>0) {
	s=n%10;
	n=n/10;
	System.out.println(s);
}
	}

}
