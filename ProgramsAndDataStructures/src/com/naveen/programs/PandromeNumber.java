package com.naveen.programs;

public class PandromeNumber {
	
	public int findpandrome(int number) {
		int reversenumber = 0;
		int remainder;
		while(number !=0) {
			remainder = number%10;
			reversenumber= reversenumber*10+ remainder;
			number = number/10;
		}
		return reversenumber;
	}											
															

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PandromeNumber pandromeNumber = new PandromeNumber();
		int n=121;
		int number=pandromeNumber.findpandrome(n);
		if(n==number) {
			System.out.println("pandrome");
		}

	}

}
