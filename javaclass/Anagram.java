package javaclass;

import java.util.Arrays;

public class Anagram {

	public static void main(String args[]) {
		String text1 = "sari#tha";
		String text2 = "asirtah#";
		int len1 = text1.length();
		int len2 = text2.length();

		if (len1 == len2)
		{
			char ch1[] = text1.toCharArray();
			Arrays.sort(ch1);
			char ch2[] = text2.toCharArray();
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
				System.out.println("The Given Strings are Anagram");
			else 
				System.out.println("The Given Strings are Not an Anagram");
		}
		else {
			System.out.println("The Given Strings are Not an Anagram");

		}


		




	}

}

/*
 * Pseudo Code
 * 
 * Declare a String String text1 = "stops"; 
 * Declare another String String text2
 * = "potss";
 *  a) Check length of the strings are same then (Use A Condition)
 *   b) * Convert both Strings in to character
 * s c) Sort Both the arrays
 *  d) Check both the arrays has same value
 * 
 */
