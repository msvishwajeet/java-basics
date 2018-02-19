package com.practice.java.learning;

import java.io.IOException;
import java.util.Scanner;

//program to check whether a given char is Uppercase Lowercase or number or Special char
public class Eight {

	public static void main(String[] args) throws IOException {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a char");
char ch=sc.next().charAt(0);
System.out.println(ch);
sc.close();
if (ch<=90&&ch>=65) {
	System.out.println("Upper case");
}
else if (ch<=122&&ch>=97) {
	System.out.println("Lower case");
}
else if (ch<=57&&ch>=48) {
	System.out.println("number");
}
else {
	System.out.println("Special character");
}

	}

}
