package com.naveen.datastructures;

public class Bubblesort {

	/**
	 * @param args
	 */
	static int arr[]={9,8,10,5,3,2,6,4,1};
	public void bubbleSort(int arr[]){
		
	for(int out=arr.length-1;out>0;out--){
		for(int in=0;in<out;in++){
			if(arr[in]>arr[in+1]){
				swap(in,in+1);
			}
		}
	}
	}
	                                
	private void swap(int one, int two ) {
		// TODO Auto-generated method stub
		int temp;
		temp=arr[one];
		arr[one]=arr[two];
		arr[two]=temp;
		
	}
	
	public void display(){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubblesort bubblesort= new Bubblesort();
		
		System.out.println("Before sorting:");
		bubblesort.display();
		bubblesort.bubbleSort(arr);
		System.out.println("After  sorting:");
		bubblesort.display();

	}

}
