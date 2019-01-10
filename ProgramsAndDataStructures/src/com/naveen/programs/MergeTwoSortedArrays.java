package com.naveen.programs;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] arrayA = {23,47,81,95};
		int[] arrayB = {7,14,39,55,62,74};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		int arraySizeA = arrayA.length;
		int arraySizeB = arrayB.length;
		merge(arrayA,arraySizeA,arrayB,arraySizeB,arrayC);
		display(arrayC,arraySizeA+arraySizeB);
	}

	private static void display(int[] arrayC, int i) {
		Arrays.stream(arrayC).forEach(System.out::println);	
		
	}

	private static void merge(int[] arrayA, int arraySizeA, int[] arrayB, int arraySizeB, int[] arrayC) {
 
		int aidx=0,bidx=0,cidx=0;
		
		while(aidx<arraySizeA && bidx<arraySizeB) { //neither empty
			if(arrayA[aidx]<arrayB[bidx]) {
				arrayC[cidx++]=arrayA[aidx++];
				
			}else {
				arrayC[cidx++]=arrayB[bidx++];
			}
			
		}
			
			while(aidx<arraySizeA) {      //B is empty
				arrayC[cidx++]=arrayA[aidx++];
				
			}
			while(bidx<arraySizeB) {     //A is empty
				arrayC[cidx++]=arrayB[bidx++];
			}
			
		
		
	}

}
