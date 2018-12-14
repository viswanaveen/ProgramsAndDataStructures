package com.naveen.programs;

import java.util.HashSet;
import java.util.Set;
/*
 * write a JAVA method that will count the number of duplicate words in a String, and will output the total count.
what data structure do you use?
 */
public class CountDuplicates {
	
	public void countduplicated(){
		int dups = 0;
        String sentence = "Naveen Kumar Naveen Kumar";
        Set<String> set = new HashSet<String>();
        for (String w : sentence.split(" ")) {
            if (!set.add(w)) 
            	dups++;
        }

        System.out.println(dups);
	}
	
	public static void main(String[] args){
		CountDuplicates countDuplicates= new CountDuplicates();
		countDuplicates.countduplicated();
	}
}
