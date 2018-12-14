package com.naveen.programs;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();
     
        identityMap.put("sony", "bravia");
        identityMap.put(new String("sony"), "mobile");
     
        //size of identityMap should be 2 here because two strings are different objects
        System.out.println("Size of IdentityHashMap: " + identityMap.size());
        System.out.println("IdentityHashMap: " + identityMap);
     
        identityMap.put("sony", "videogame");
     
         //size of identityMap still should be 2 because "sony" and "sony" is same object
        System.out.println("Size of IdentityHashMap: " + identityMap.size());
        System.out.println("IdentityHashMap: " + identityMap);
        
        //hash map example
   
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("sony", "bravia");
        map.put(new String("sony"), "mobile");
     
        //size of map should be 1 here because two strings are different objects
        System.out.println("Size of map: " + map.size());
        System.out.println("map: " + map);
     
        map.put("sony", "videogame");
     
         //size of map still should be 1 because "sony" and "sony" is same object
        System.out.println("Size of map: " + map.size());
        System.out.println("map: " + map);
    }
}




