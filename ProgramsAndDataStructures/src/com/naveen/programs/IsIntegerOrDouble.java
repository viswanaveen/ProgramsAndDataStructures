package com.naveen.programs;

import java.math.BigInteger;

public class IsIntegerOrDouble {

	private double i;
	/**
	 * @param args
	 */
	IsIntegerOrDouble(){
		
	}
	public void isInteger(double d){
		{
			//Double i=0.0;
			if((long)d == d){
				Integer i=new Integer((int)d);
		       System.out.println("d is integer"+i);
		    } else 
		    	  //i=new Double(d);
		    	System.out.println("d is double"+d);
		    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsIntegerOrDouble double1= new IsIntegerOrDouble();
		double1.isInteger(100.084);

	}

}
