package com.collections.practice;

import java.util.ArrayList;
import java.util.Collections;


public class Sort {
	
	public static void main(String[] args) {
	
				ArrayList<String> list=new ArrayList<String>();
				list.add("Hari");
				list.add("Vidya");
				list.add("Dhivya");
				list.add("Naveen");
				list.add("Sheriba");
				System.out.println("******Before sorting*******");
				System.out.println(list);
				Collections.sort(list);
				System.out.println("***After sorting*****");
				for (String names : list) {
					System.out.println(names);
				}
					
				}

}
