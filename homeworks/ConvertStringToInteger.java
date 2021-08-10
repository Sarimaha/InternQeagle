package homeworks;

public class ConvertStringToInteger {
	/*
	 * Assignment: String str = "Rs. 1,848";
	 *  Convert to integer and add 100 to it
	 * Print the result
	 */
	public static void main(String args[])
	{
		String str="Rs.1,848";
		System.out.println("The given String is: "+str);
		String replacedString=str.replaceAll("[a-zA-Z.,]+", "");
		System.out.println("After converting to  Integer, the value is: "+replacedString);
		int sam=Integer.parseInt(replacedString);
		int result=sam+100;

		System.out.println("Sum of the "+sam+" and + 100 is: "+result);

	}
}