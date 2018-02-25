package com.collection.program;

public class BubbleSort {

	public static void main(String[] args) {
    int []arr= {12,2,65,3,42,57,99,2};
    print(arr);
    int n=arr.length-1;
    bubbleSort(arr,n);
    print(arr);
	}
	public static void print(int ar[]) {
		for (int i : ar) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	/* **********NON Recursive*****************
	 * public static void bubbleSort(int ar[]) {
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = 0; j < ar.length-i-1; j++) {
				if (ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		print(ar);
	}*/
	public static void bubbleSort(int ar[],int n) {
		if (n == 1)
            return;
		for (int j = 0; j < n; j++) {
				if (ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
				
				bubbleSort(ar,n-1);
			}
		//System.out.println(n);
		//print(ar);
		
		
	}
}
