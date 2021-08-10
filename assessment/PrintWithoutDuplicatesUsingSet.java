package com.assessment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintWithoutDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,8,5,7,5,1,9,8,8,9,1,5,12,45,28,42};
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(1,8,5,7,5,1,9,8));
		System.out.println(set);
		

	}

}
