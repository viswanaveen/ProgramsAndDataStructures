package com.naveen.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String a = in.next();
			String b = in.next();
			System.out.println(numberNeeded(a, b));
		}

		private static int numberNeeded(String first, String second) {
			Map<Character,Integer> firstMap= null;
			char[] firstchar=null;
			if(first!=null) {
				firstMap = new HashMap<>();
				firstchar =first.toCharArray();
				for(char c:firstchar) {
					if(!firstMap.containsKey(c)) {
						firstMap.put(c, 1);
					}else {
						firstMap.put(c, firstMap.get(c)+1);
					}
				}
			}
			
			Map<Character,Integer> secondMap=null;
			char[] secondChar =null;
			if(second!=null) {
				secondMap= new HashMap<>();
				secondChar=second.toCharArray();
				for(char c:secondChar) {
					if(!secondMap.containsKey(c)) {
						secondMap.put(c, 1);
					}else {
						secondMap.put(c, secondMap.get(c)+1);
					}
				}
			}
			int count=0;
			for(Map.Entry<Character, Integer> entry:firstMap.entrySet()) {
				if(secondMap.containsKey(entry.getKey())) {
					count+=Math.abs(secondMap.get(entry.getKey()))-
							Math.abs(firstMap.get(entry.getKey()));
					secondMap.remove(entry.getKey());
				}else {
					count+=firstMap.get(entry.getKey());
				}
			}
			for(Map.Entry<Character, Integer> entry:secondMap.entrySet()) {
				if(firstMap.containsKey(entry.getKey())) {
					count+=Math.abs(firstMap.get(entry.getKey()))-
							Math.abs(secondMap.get(entry.getKey()));
					firstMap.remove(entry.getKey());
				}else {
					count+=secondMap.get(entry.getKey());
				}
			}
			return count;
		}

	}

