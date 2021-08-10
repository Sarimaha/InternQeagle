package com.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ItersectionArrays {
	public static void main(String[] args) {

	//Method1//
	ArrayList<Integer>arr1=new ArrayList<Integer>();
	arr1.add(3);
	arr1.add(2);
	arr1.add(11);
	arr1.add(4);
	arr1.add(6);
	arr1.add(7);
	
	ArrayList<Integer>arr2=new ArrayList<Integer>();
	arr2.add(1);
	arr2.add(2);
	arr2.add(8);
	arr2.add(4);
	arr2.add(9);
	arr2.add(7);

arr1.retainAll(arr2);
System.out.println("Intersection:"+arr1);

}



}
