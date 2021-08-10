package com.string.assessment;

import java.util.Arrays;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		//Find the missing elements in an array: int[] arr ={4,2,0,5,1,6,7}
		
		 int[] arr ={4,2,0,5,1,6,7};
		 Arrays.sort(arr);
		 System.out.println("Elements in the given array");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 for(int i=arr[0];i<arr.length;i++)
		 {
			 if(i!=arr[i])
			 {
				 System.out.println("Missing element is "+i);
				 break;
			 }
			
		 }
	
	}

}
