package com.collection.program;

public class BinarySearch {

	public static void main(String[] args) {
		int ar[]= {12,34,35,45,65,76,78,90,99,100};
		for (int i : ar) {
			System.out.print(i+" ");
		}
		System.out.println();
	 int s=35;
	 int l=0;
	 int r=ar.length-1;
	 System.out.println(s);
	 System.out.println(binarSearch(ar,s,l,r));
	}

	private static int binarSearch(int[] ar, int s,int l,int r) {
		if (l<r) {
			int m=((l+r)/2)+1;
			if (ar[m]==s) {
				return m;
			}
			else if (ar[m]>s){
				return binarSearch(ar, s, l, m-1);
			}
			else if(ar[m]<s) {
				return binarSearch(ar, s, m+1, r);
			}
		}
		return -1;
	}
}
