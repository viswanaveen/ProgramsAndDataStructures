package com.naveen.programs;

public class ReverseArray {

	/**
	 * @param args
	 */
	private static String[] reverseArray(String[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		String[] reverseArray=new String[arr.length] ;
		for(int j=arr.length-1;j>=0;j--){
			reverseArray[i]=arr[j];
			i++;
		}
		return reverseArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []arr={"Naveen","kumar"};
		for(int i=0;i<arr.length;i++){
			System.out.println("not reverse  :"+arr[i]);
		}
       String[] reverseArray= reverseArray(arr);
       for(int i=0;i<reverseArray.length;i++){
			System.out.println(" reverse  :"+reverseArray[i]);
		}
	}

	
}
