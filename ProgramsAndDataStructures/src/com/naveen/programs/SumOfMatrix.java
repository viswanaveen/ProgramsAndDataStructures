package com.naveen.programs;

public class SumOfMatrix {

	/**
	 * @param args
	 */
	public void m1(){
		int A[][] = { {1,1,1,1} ,{1,1,1,1} ,{1,1,1,1} ,{1,1,1,1} };
		 int B[][] = new int [4][4];


		for( int i = 0; i < 4; i++ )
		{
		for( int j = 0; j < 4; j++ )
		{
		int left = (j > 0 ? B[i][j-1] : 0) ;
		int upper = (i > 0 ? B[i-1][j] : 0);
		int sum = left + upper + A[i][j];
		B[i][j] = sum;
		}
		}
		
		for(int z=0;z<4;z++){
			System.out.println(B[z][0] + " " +B[z][1] + " " +B[z][2] +" " +B[z][3]);
		}

				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfMatrix matrix= new SumOfMatrix();
		matrix.m1();
 
	}
}
