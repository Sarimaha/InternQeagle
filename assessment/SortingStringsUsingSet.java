package com.assessment;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortingStringsUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Roshini","Pavithra","Annamali","Hinduja"};
		Set<String> set1=new TreeSet<String>();
		for(String str:names)
		{
			set1.add(str);
		}
			System.out.println(set1);
			
			//another method using Arrays as List()
			Set<String> set2=new TreeSet<String>(Arrays.asList("Roshini","Pavithra","Annamali","Hinduja"));
			System.out.println(set2);
	}

}
