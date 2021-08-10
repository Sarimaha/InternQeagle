package javaclass;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="refer";
		String rev="";
		//String original="refer;
		int len=str.length();
		//	System.out.println(len);

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);

		}
		if(str.equals(rev))
		
			System.out.println("The Given String is "+str+" and it is Palindrome");
		else
			System.out.println("The Given String is "+rev+" and it is Not a Palindrome");
		/*;

		 * Pseudo Code

		 * a) Declare A String value as"madam"

		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	}

}
