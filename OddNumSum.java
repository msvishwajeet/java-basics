package com.practice.java.learning;

import java.util.Scanner;

public class OddNumSum {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int i=1;
sc.close();int sum=0;
while (i<=n) {
	if (i%2!=0) {
		sum+=i;
	}
	i++;
}
System.out.println(sum);
	}

}
