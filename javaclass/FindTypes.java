package javaclass;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char ch[] = test.toCharArray();

		int len = ch.length;
		System.out.println("Length of the given String is: "+len);
		for (int i = 0; i < len; i++) 
		//for(char c:ch)
		{
			if (Character.isDigit(ch[i]))
				num++;
			else if (Character.isLetter(ch[i]))
				letter++;
			else if (Character.isSpaceChar(ch[i]))
				space++;
			else
				//Character.sp
				specialChar++;
		}

		System.out.println("Total no of letters: " + letter);
		System.out.println("Total no of space: " + space);
		System.out.println("Total no of number: " + num);
		System.out.println("Total no of specialCharcter: " + specialChar);

	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Build the logic to find the count of each
		/*
		 * Pseudo Code: a) Convert the String to character array b) Traverse through
		 * each character (using loop) c) Find if the given character is what type using
		 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
		 * iv) else -> consider as special character
		 */

		// Print the count here


