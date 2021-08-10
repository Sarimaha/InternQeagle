package com.collections.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupli {

	public static void main(String[] args) {
	//	int array[]={1,3,3,3,3,5,6,6,7,7,7};
		LinkedHashSet<Integer> rda=new LinkedHashSet<Integer>(Arrays.asList(1,3,3,3,3,5,6,6,7,7,7));
		for (Integer i : rda) {
			System.out.println(i);
		}
		
	}

}
      



