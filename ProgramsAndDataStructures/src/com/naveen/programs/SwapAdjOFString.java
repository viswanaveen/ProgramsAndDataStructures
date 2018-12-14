package com.naveen.programs;

public class SwapAdjOFString {

	/**
	 * @param args
	 */
	
	char[] cs;
	public void getString(String str){
		cs=str.toCharArray();
		for(int out=cs.length-1;out>1;out--){
			for(int in=0;in<out;in++){
				if(cs[in]>cs[in+1])
				swap(in,out);
			}
		}
	}
	private void swap(int in, int out) {
		char temp=cs[in];
		cs[in] =cs[out];
		cs[out]=temp;
	}
	
	public void display(){
		for(int i=0;i<cs.length;i++){
			System.out.print(cs[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapAdjOFString adjOFString= new SwapAdjOFString();
		adjOFString.getString("100001");
		adjOFString.display();
		
	}

}
