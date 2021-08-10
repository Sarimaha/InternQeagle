package com.string.assessment;

public class TwoSumProblem {
	//Two sum problem: {3,5,2,1,6,3,9} Target value : 6 
	//a) Find the pair that adds to
//b) Print the index of those pairs 
	public static void main(String args[])
	{
	int arr[]= {3,5,2,1,6,3,9};
	int target=6;
	int len=arr.length;
	for(int i=0;i<len;i++)
	{
		for(int j=0;j<len;j++)
		{
			if(arr[i]+arr[j]==target&&(i!=j))
			{
				System.out.println("Pair that adds to 6 : ["+arr[i]+","+arr[j]+"]");
				System.out.println("Index of the first number:"+i);
				System.out.println("Index of the second number:"+j);
				System.out.println();
			}
		}
	}
	}
}