package com.naveen.datastructures;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[]= {5,1,7,3,4};
		int sortArr[]=insertionSort.sort(arr);
		Arrays.stream(sortArr).forEach(System.out::println);

	}

}
