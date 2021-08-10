package com.assessment;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionUsingSet {

	public static void main(String args[])
	{
		
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		for(int i:arr1)
		{
			set1.add(i);
		}
		for(int j:arr2)
		{
			set2.add(j);
		}
		set1.retainAll(set2);
		System.out.println("Intersection values are :"+set1);
		
		
				
			
		
		
		
		
	}
}
