package com.naveen.programs;

public class FindUnique {

	/**
	 * @param args
	 */
	public  void findUnique(char[] a) {
		int[] A = new int[26];
		int[] B = new int[26];
		int elementsInA = 0;
		int index = 0;
		for (int i = 0; i < 26; i++)
			B[i] = -1;

		
		for (int i = 0; i < a.length; i++) {
		index = B[a[i] - 'a'];
		if (index != -1) {
		A[index] += 1;
		} else {
		B[a[i] - 'a'] = elementsInA++;
		A[B[a[i] - 'a']] = 1;
		}
		}
		
		int foundAt = -1;
		for(int i = 0 ; i < A.length ; i++){
		if(A[i] == 1){
		foundAt = i;
		break;
		}
		}
		
		if(foundAt == -1)
		System.out.println("No unique");
		else{
		for(int i = 0 ; i < B.length ; i++){
		if(B[i] == foundAt){
		System.out.println((char)(i+'a'));
		//break;
		}
		}
		}
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindUnique findUniqu= new FindUnique();
char a[]={ 'a', 'a', 'b', 'q', 'b' ,'c'};
findUniqu.findUnique(a);
	}

}
