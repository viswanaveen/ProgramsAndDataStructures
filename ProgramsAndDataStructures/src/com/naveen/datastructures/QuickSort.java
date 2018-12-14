package com.naveen.datastructures;


public class QuickSort {

	
	//int sortnum[]={5,2,9,3,2,7};
	public int parition(int arr[],int left,int right)
	{
	int temp;
	int i=left;
	int j=right;
	int piot=arr[(left+right)/2];
	while(i<=j){
	
		while(arr[i]<piot){
			i++;
		}
		while(arr[j]>piot){
			j--;
		}
		if(i<=j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;i++;j--;
		}	
	}
		
		return i;
	}
	public void quickSort(int arr[],int left,int right)
	{
		int index=parition(arr,left,right);
		if(left<index-1){
			quickSort(arr,left,index-1);
		}
		if(index<right){
			quickSort(arr,index,right);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrs[]={5,2,9,4,6,8,3,2,7};
		System.out.println("Before Sorting::");
		for(int i=0;i<arrs.length;i++)
		{
		System.out.print(arrs[i]);}
		QuickSort qs=new QuickSort();
		
		qs.quickSort(arrs, 0,arrs.length-1);
		
		System.out.println("After Sorting::");
		for(int i=0;i<arrs.length;i++)
		System.out.println(arrs[i]);
		
	}

}

