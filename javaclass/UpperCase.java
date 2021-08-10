package javaclass;

public class UpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		/*int len=test.length();
		System.out.println("Lenth of the string is: "+len);
		char ch[]=new char[len];*/
		char ch[]=test.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=test.charAt(i);

			if(i%2!=0)
			{

				char up=Character.toUpperCase(ch[i]);
				System.out.println("Index of the character is "+i+" and the character is "+up);
			}
			else
				System.out.println("Index of the character is "+i+" and the character is "+ch[i]);
		}


		/*
		 Pseudo Code

		 * Declare String Input as Follow

		 * String test = "changeme";

		 * a) Convert the String to character array

		 * b) Traverse through each character (using loop)

		 * c)find the odd index within the loop (use mod operator)

		 * d)within the loop, change the character to uppercase, if the index is odd else don't change

		 */
	}

}
