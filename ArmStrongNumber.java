package com.practice.java.learning;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
/*String s=sc.nextLine();
int n=Integer.valueOf(s);
System.out.println(s);
System.out.println(n);
System.out.println();*/
int n=sc.nextInt();
int m=n;
String s1=n+"";
int len=s1.length();
if (armStr(n,len)==m) {
	System.out.println("ArmStrong Number");
}
else {
	System.out.println("Not an ARMSTRONG");
}
	}

	private static int armStr(int n, int len) {
		int sum=0;
		while (n>0) {
			sum+=mul(n%10,len);
			n=n/10;
		}
		return sum;
	}

	private static int mul(int len, int len2) {
		int mul=1;
		for (int i = 1; i <=len2; i++) {
			mul*=len;
		}
		return mul;
	}

}
