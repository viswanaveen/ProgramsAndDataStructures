package com.naveen.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//fsqoiaidfaukvngpsugszsnseskicpejjvytviya
//ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget

//fsqoi

//twxget

public class HackerAnagram {

	public static int numberNeeded(String first, String second) {
		Map<Character,Integer> firstMap = null;
		int count=0;
		char[] firstchar=null;
		if(first!=null){
		 firstchar = first.toCharArray();
		 firstMap=new HashMap<Character,Integer>();
		 for(char c:firstchar){
			 if(!firstMap.containsKey(c)){
			 firstMap.put(c,1);
			 }
			 else{
				 firstMap.put(c, firstMap.get(c)+1);
			 }
			 
		 }
		}
		 
		 Map<Character,Integer> secondMap=null;
			char[] secondchar=null;
			if(second!=null){
				secondchar = second.toCharArray();
			 secondMap=new HashMap<Character,Integer>();
			 for(char c:secondchar){
				 if(!secondMap.containsKey(c)){
					 secondMap.put(c,1);
				 }
				 else{
					 secondMap.put(c, secondMap.get(c)+1);
				 }
				 
			 }
			}

			 for(Map.Entry<Character,Integer> entry:  firstMap.entrySet()){
				 if(secondMap.containsKey(entry.getKey())){
					count+= Math.abs(secondMap.get(entry.getKey())-firstMap.get(entry.getKey()));
					secondMap.remove(entry.getKey());
				 }
				 else{
					 count=count+firstMap.get(entry.getKey());
				 }
				
			 }
	 for(Map.Entry<Character,Integer> entry:  secondMap.entrySet()){
		 if(firstMap.containsKey(entry.getKey())){
			count+= Math.abs(secondMap.get(entry.getKey())-firstMap.get(entry.getKey()));
			firstMap.remove(entry.getKey());
		 }
		 else{
			 count=count+secondMap.get(entry.getKey());
		 }
		
	 }
	 
	
		return count;
	      
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
