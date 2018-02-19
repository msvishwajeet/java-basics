package com.practice.java.learning;
import java.util.Scanner;
//first n odd number
public class Ten {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	sc.close();
	int i=1;
	while (i<=n) {
		if (i%2!=0) {
		System.out.println(i);
		}
		i++;
	}
}
}
