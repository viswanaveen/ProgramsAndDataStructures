package com.naveen.programs;

import java.util.Arrays;

public class RightRotation {
	
	static int[] rightRotation(int[] a, int d) {
        // Complete this function
        int tempArr[]= new int[a.length];
	        for(int i=0;i<a.length;i++){
	        	
	        	int index = (i+d)%a.length;
	        	tempArr[index]=a[i];
	      }
	        
	        return tempArr;
    }

	public static void main(String[] args) {

int a[] = {1,2,3,4};
RightRotation rightRotation = new RightRotation();
int[] arr=rightRotation.rightRotation(a, 4);
System.out.println(Arrays.toString(arr
		));
	}

}
