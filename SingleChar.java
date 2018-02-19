package com.practice.java.learning;

import java.util.Scanner;

public class SingleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Char");
String c=sc.next();
while (c.length()!=1) {
	//c="";
	System.err.println("Please enter only one character");
	c=sc.next();
}
sc.close();
System.out.println("your entered char is >>>  "+c);
	}

}
