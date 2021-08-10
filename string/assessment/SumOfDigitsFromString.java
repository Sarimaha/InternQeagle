package com.string.assessment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of digits from a given String String str = "Welcome23Ch67ennai67""
		int total=0;
		int value;
		String givenString = "Welcome23Ch67ennai67";
		System.out.println("The given String is: "+givenString);
		String digits=givenString.replaceAll("[\\D]", "");
		System.out.println("Digits present in the string: "+digits);
		char ch[]=givenString.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++)
		{
			value=Character.getNumericValue(ch[i]);
			total=total+value;
		}
		System.out.println("Sum of the digits is: "+total);


	}

}
/*Store the string in a string variable
 * con*/
