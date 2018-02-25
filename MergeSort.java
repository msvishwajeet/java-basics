package com.collection.program;

public class MergeSort {
	static void merge(int[] a,int[] b, int[] c)
	{
	int i=0, j=0, k=0;
	int l1=a.length, l2=b.length;
	while(i<l1 && j<l2)
	{
	if(a[i]<b[j])
	{
	c[k]=a[i++];
	}
	else
	{
	c[k]=b[j++];
	}
	k++;
	}
	while(i<l1)
	{
	c[k++]=a[i++];
	}
	while(j<l2)
	{
	c[k++]=b[j++];
	}
	}
	static void mergeSort(int[] a)
	{
	if(a.length==1)
	return;
	int mid=a.length/2;
	int left[]=new int[mid];
	for(int i=0;i<mid;i++)
	{
	left[i]=a[i];
	}
	int right[]=new int[a.length-mid];
	for(int i=mid,j=0;i<a.length;i++,j++)
	{
	right[j]=a[i];
	}
	mergeSort(left);
	mergeSort(right);
	merge(left,right,a);
	}
	public static void main(String[] args)
	{
	int a[]={1,8,3,6,2,7,9,10};
	for(int n: a)
	{
	System.out.print(n);
	}
	System.out.println();
	mergeSort(a);
	for(int n: a)
	{
	System.out.print(n);
	}
	}
	
}
