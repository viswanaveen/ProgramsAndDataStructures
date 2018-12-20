package com.naveen.programs;
/*************************************
 * Printing in this format
 * 
 *			     #
 *			    ##
 *			   ###
 *			  ####
 *			 #####
 *			######
 * 
 * 
 * 
 * 
 * 
 ************************************
 */

public class StairCase {
	
	public void printStairCase(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)>n) {
					System.out.print("#");
				}else {
					System.out.print( " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StairCase stairCase = new StairCase();
		stairCase.printStairCase(6);

	}

}
