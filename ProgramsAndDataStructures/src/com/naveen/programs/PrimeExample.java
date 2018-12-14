package com.naveen.programs;

public class PrimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++){
			boolean isPrimeNumber = true;

			for(int j=2;j<i;j++){
				if(i%j==0)
					isPrimeNumber = false;
				
					break;
			}
			if (isPrimeNumber) {
				
				                System.out.print(i + " ");
				
				            }

		}
		
		
        int no=7;
		boolean isPrimeNumberno = true;

		for(int l=2;l<no;l++){
			if(no%l==0)
				isPrimeNumberno = false;
			
				break;
		}
		if (isPrimeNumberno) {
			
			                System.out.print(no + "yes ");
			
			            }

	
		
		
		
		
		

	}

}
