package com.collection.program;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,55,87,21,11,4,1};
		printl(arr);
		heapSort(arr);
		printl(arr);
	}
	private static void heapSort(int[] arr) {
		int n=arr.length-1;
		for (int i = n; i >=0; i--) {
			int k=arr[i];
			int p=i;
			for (int j = i-1; j >=0; j--) {
				 
				if (arr[j]>k) {
					k=arr[j];
					p=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[p];
			arr[p]=temp;
		}
	}
	public static void printl(int ar1[]) {
		for (int i : ar1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
