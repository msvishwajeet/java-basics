package com.practice.java.learning;

//import java.math.BigInteger;
import java.util.Scanner;

public class NumberOfDigitInAGivenNumber {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Number");
//BigInteger n=sc.nextBigInteger();
int n=sc.nextInt();
int i=0;
while (n>0) {
	n=n/10;
	i++;
}
System.out.println(i);
sc.close();
	}
}
