package com.naveen.datastructures;

public class BinarySearchAlgorithm {
	
	public void searchValue(int arr[],int searchValue ) {
		int low=0;
		int high= arr.length-1;
		int middle = (low+high)/2;
		
		while(low<=high) {
			if(arr[middle]==searchValue) {
				System.out.println("search value found +" +searchValue +" at position :" +middle);
				break;
			}else if(arr[middle] < searchValue) {
				low=middle+1;
			}
			else {
				high= middle-1;
			}
			middle=(low+high)/2;
		}
		
	}

	public static void main(String[] args) {
		BinarySearchAlgorithm  algorithm= new BinarySearchAlgorithm();
		int arr[] = {10, 20, 25, 57, 63, 96};
		algorithm.searchValue(arr, 20);
	}

}
