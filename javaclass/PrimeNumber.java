package javaclass;

public class PrimeNumber {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int input=8;
		int remainder;

		// Declare a boolean variable flag as false
		boolean flag=false;	

		// Iterate from 2 to half of the input
				for(int i=2;i<(input/2);i++)
		{
			// Divide the input with each for loop variable and check the remainder
			remainder= input%i;
			if(remainder==0)
			{
				// Set the flag as true when there is no remainder
				
				flag=true;
				break;		
			
			}
				}
		if(flag==true)
		{System.out.println("Given number is not a prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	

	}


}


