package com.practice.java.learning;

import java.util.Scanner;

public class AdditionWithoutPlus {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(a+"---"+b);
a=a+b;
b=a-b;

a=a-b;
System.out.println(a+"---"+b);
	}

}
