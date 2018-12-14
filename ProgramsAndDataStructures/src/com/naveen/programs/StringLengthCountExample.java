package com.naveen.programs;

public class StringLengthCountExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaabbbc";
		String myStr="";
		char last=str.charAt(0);
		
		
		int count=1;
		for(int i=1;i<str.length();i++){
			
			if(str.charAt(i)==last){
				count++;
				
			}else{
				
				myStr+=last +""+count;
				last=str.charAt(i);
				count=1;
			}
			}
			
		
		
		System.out.println(myStr+last+count);

	}

}
