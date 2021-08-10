package com.assessment;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArrayUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,5,7,5,1,9,8};
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("Duplicate values found are:");
		for(int i:arr)
		{
			if(set.add(i)==false)
			{
				System.out.println(i);
			}
			
		}

	}

}
