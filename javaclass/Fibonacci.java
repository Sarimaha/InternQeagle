package javaclass;

public class Fibonacci {
	public static void main(String[] args)
	{
		/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		*/


		//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int firstNum=0;
		int secNum=1;
		int range=8;
		int sum=0;

		//Print first number
		System.out.print(firstNum+", ");
		
		System.out.print(secNum);
		//Iterate from 1 to the range
		for(int i=2;i<range;i++) {

			// add first and second number assign to sum
			sum=firstNum+secNum;

			// Assign second number to the first number
			firstNum=secNum;

			// Assign sum to the second number
			secNum=sum;

			// print sum
			System.out.print(", "+sum);
		}

	}
}