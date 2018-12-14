package com.naveen.programs;

import java.util.HashMap;
import java.util.Map;

public class GetDuplicate {

	/**
	 * You are given an array of n integers which can contain integers from 1 to n only . 
	 * Some elements can be repeated multiple times and some other elements can be absent from the array . 
	 * Write a running code on paper which takes O(1) space apart from the input array and O(n) time to print which elements are not present
	 * in the array and the count of every element which is there in the array along with the element number .
     NOTE: The array isn't necessarily sorted.
	 */
	void getDuplicate()
	{
	    int [] array = {1,2,3,4,5,6,6,6,6,8,9};
	    
	    Map<Integer,Integer> m = new HashMap<Integer, Integer>();
	    for(int i=0; i<=array.length-1;i++){
	    	if(m.containsKey(array[i]))
		    	m.put(array[i],m.get(array[i]).intValue()+1);
	    	else
	    		m.put(array[i],1);

	    	
	    }
	    for(int i =0; i<= array.length-1; i++){
	    	if(m.containsKey(array[i]))
	    	 System.out.println("The element" + array[i] + "is present"+"at"+i+"with value" + m.get(i));
	    	else 
	    		System.out.println("The element" + array[i] + "is absent" );
	    }
		

	}
	
	public static void main(String[] args) {
		GetDuplicate duplicate= new GetDuplicate();
		duplicate.getDuplicate();
		
	}

}
