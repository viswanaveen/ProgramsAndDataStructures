package com.naveen.programs;

public class Permatation {

	/**
	 * @param args
	 */
	public boolean permatation(String firststr, String secondstr){
		if(firststr.length()!=secondstr.length()){
			return false;
		}
		int[] letters=new int[256]; 
		char[] firststr_array=firststr.toCharArray();
		for(char c:firststr_array){
			letters[c]++;	
		}
		for(int i=0;i<secondstr.length();i++){
			int c=(int)secondstr.charAt(i);
			if(--letters[c]<0){
				System.out.println("==failed due to count is less than 0==");
				return false;
			}
		}
		System.out.println("==permatation==");
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permatation permatation= new  Permatation();
		permatation.permatation("dog", "god");

	}

}
