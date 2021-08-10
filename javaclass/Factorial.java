package javaclass;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Goal: Find the Factorial of a given number
		 * 
		 * input: 5
		 * output: 5*4*3*2*1 = 120
		*/


		// Declare your input as 5
		int input=5;


		// Declare an integer variable fact as 1
		int fact=1;

		// Iterate from 1 to your input (tip: using loop concept)
		for(int i=1;i<=5;i++)
		{
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact=fact*i;
			//End of loop
		}
		// Print factorial (fact)
		System.out.println(fact);

	}
}
