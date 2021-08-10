package com.collections.practice;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java,Python,Ruby,JavaScript,R]
				ArrayList<String> list=new ArrayList<String>();
				list.add("Java");
				list.add("Python");
				list.add("Ruby");
				list.add("JavaScript");
				list.add("R");
				System.out.println("Elements in the list are:");
				System.out.println(list);
				System.out.println();
				list.remove(2);
				System.out.println("After removing Ruby from this list:");
				System.out.println(list);
				System.out.println();
				list.remove(3);
				System.out.println("After removing R from this list:");
				System.out.println(list);
	}

}
