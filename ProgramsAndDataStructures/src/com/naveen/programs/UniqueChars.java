package com.naveen.programs;

public class UniqueChars {

	/**
	 * @param args
	 */
	public boolean isUniqueChars(String str){
		if(str.length()>256)
			return false;
		int checker=0;
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i)-'a';
			if((checker & (1 << val))>0){
				return false;
			
			}
			checker|=(1 << val);
		}
	
		return true;
	}
	public static void main(String[] args) {
		
		UniqueChars chars = new  UniqueChars();
		chars.isUniqueChars("abc");
	}

}
