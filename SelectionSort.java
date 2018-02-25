package com.collection.program;
public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {10,2,55,87,21,11,4,1};
		printl(arr);
		sort(arr);
		printl(arr);
	}
	public static void printl(int ar1[]) {
		for (int i : ar1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void sort(int ar[]) {
		for (int i = 0; i < ar.length-1; i++) {
			int k=ar[i];
			int p=i;
			for (int j = i+1; j < ar.length; j++) {
				if (k>ar[j]) {
					k=ar[j];
				 	p=j;
				}
			}
			if (p>i) {
			int temp=ar[p];
			ar[p]=ar[i];
			ar[i]=temp;
			}
		}
		//printl(ar);
	}

}
