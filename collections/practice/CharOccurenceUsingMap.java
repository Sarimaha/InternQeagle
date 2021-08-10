package com.collections.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharOccurenceUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Most Welcome";
		int count=0;
		Map<Integer,Character> map=new LinkedHashMap<Integer,Character>();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{ 
			map.put(i,ch[i]);
		}
		System.out.println("Map has the below Key Value pairs:");
		System.out.println(map);
		for(Entry<Integer, Character> eachEntry:map.entrySet())
		{
			char q=eachEntry.getValue();
			if(q=='e') 
			{
				System.out.println("Charecter : "+q+" and its index is "+eachEntry.getKey() );
				count++;
			} 			
		}
		System.out.println("The number of Occurence is :"+count);
	}
	}








	/*
	 1. Declare a string 
	 2. Create a map with char as key and int as value.
	  3. Convert the string to char array 
	  4. Traverse using for each 
	  5. Check if it contains e 
	  6. Print the result
	 */

