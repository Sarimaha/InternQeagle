package javaclass;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int sum=0;
		int number=1234;
		int originalNumber=number;
		int remainder=0,quotient=0;
	
		while(number>0)
		{
			remainder=number%10;
			quotient=number/10;
			sum=sum+remainder;
			number=quotient;
		}
		System.out.println("The Given Number is "+originalNumber);
		System.out.println("Sum of the digits in the given number is: "+sum);
	}
		
	
}
