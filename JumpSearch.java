package com.collection.program;

public class JumpSearch {

	public static void main(String[] args) {
		int ar[]= {11,22,24,28,34,45,56,67,87,89,90,92,94,96,97,98};
		for (int i : ar) {
			System.out.print(i+" ");
		}
		System.out.println();
		int n=ar.length;
		int jump=(int)Math.floor(Math.sqrt(n));
		System.out.println(jump);
		int s=34;
		System.out.println(s);
		int justprev=0;
		int i=0;
		while(ar[i]<s ) {
			if ((i<n-jump)) {
				i+=jump;
			}
			else {
				break;
			}
		}
		System.out.println(i);
		System.out.println(justprev);
		int res=jumpSearch(ar,jump,s);
		System.out.println(res);
	}

	private static int jumpSearch(int[] ar, int jump, int s) {
		int n=ar.length;
		int i=0;
		while(ar[i]<s) {
				if (i<n-jump) {
					i+=jump;
				}
				else {
					break;
				}
		}
		while(i<n) {
			if (ar[i]==s) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
