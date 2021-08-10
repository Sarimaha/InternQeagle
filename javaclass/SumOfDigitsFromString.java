 package javaclass;

public class SumOfDigitsFromString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af6";
		long total = 0;
		String rep=text.replaceAll("[\\D]","");
		System.out.println("Numeric values present in the given String are : "+rep);
		char[] ch=rep.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			//System.out.println(ch[i]);
			
			int j=Character.getNumericValue(ch[i]);
			total=total+j;
				}
		
		System.out.println("Sum of the digits in the String is: "+total);
		
		
		
		
		/*sumOfDigits(total);
		
	}	
		public static long sumOfDigits(long number)
			 {
			
			long sum=0;
			long remainder=0;
			//int number=1234;
			//int originalNumber=number;
			long quotient=0;
		System.out.println(number);
			while(number>0)
			{
				remainder=number%10;
				quotient=number/10;
				sum=sum+remainder;
				number=quotient;
			}
			//System.out.println("The Given Number is "+originalNumber);
			System.out.println("Sum of the digits in the given number is: "+sum);
			return sum;
		}*/
		/*
		 * Method 1
		 * Pseudo Code
		 
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */
		
		/*
		 * Method 2
		 * Pseudo Code
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using Character.getNumericValue() and add it to sum
		 * d) Now Print the value
		 */

	}
}

