package com.naveen.programs;
import java.util.Scanner;

public class LeftRotation {

	static int[] leftRotation(int[] a, int d) {
        // Complete this function
        int tempArr[]= new int[a.length];
	        int tempInd=0;
	        for(int i=d;i<a.length;i++){
	        	tempArr[tempInd]=a[i];
	        	tempInd++;
	      }
	        for(int l=0;l<d;l++){
	        	tempArr[tempInd]=a[l];
	        	tempInd++;
	        }
	        
	        return tempArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
