package com.practice.java.learning;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Number");
int n = sc.nextInt();
sc.close();
String res="";
while (n>0) {
	int c=n%10;
	switch (c) {
	case 1:
		res="One "+res;
		break;
	case 0:
		res="Zero "+res;
		break;
	case 3:
		res="Three "+res;
		break;
	case 2:
		res="Two "+res;
		break;
	case 4:
		res="Four "+res;
		break;
	case 5:
		res="Five "+res;
		break;
	case 6:
		res="Six "+res;
		break;
	case 9:
		res="Nine "+res;
		break;
	case 8:
		res="Eight "+res;
		break;
	case 7:
		res="Seven "+res;
		break;


	default:
		break;
	}
	n=n/10;
}
System.out.println(res);
}

}
