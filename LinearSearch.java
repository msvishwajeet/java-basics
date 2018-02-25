package com.collection.program;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {12,34,23,44,45,67,9,43};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int k=44;
		System.out.println();
		System.out.println(k);
		int s=linearSearch(arr,k);
		if (s<0) {
			System.out.println("No such Element Available");
		}
		else {
			System.out.println(s);
		}
		
	}

	public static int linearSearch(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==k) {
				return i;
			}
		}
		return -1;
	}

}
