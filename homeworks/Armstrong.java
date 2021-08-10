package homeworks;

import java.util.Scanner;
//program to calculate as per the 
public class Armstrong {
	public static void main(String[] args) {


		double sum=0;
		int number=153;

		int originalNumber=number;
		double result=0;
		int remainder=0,quotient=0;
		//int number=1234;
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;

		}
		System.out.println(count);

		while(number>0)
		{
			remainder=number%10;
			quotient=number/10;
		 result=Math.pow(remainder, count);
			sum=sum+result;
			number=quotient;
		}
		if(result==originalNumber)
		{
			System.out.println("The number "+originalNumber+" is an Armstrong Number");
		}
		else 
		{
			System.out.println("The number "+originalNumber+" is not an Armstrong Number");
		}

	}


}



