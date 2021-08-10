package javaclass;

public class ArmstrongNumber {

	public static void main(String[] args) {
		

		int sum=0;
		int number=370;
		
		int originalNumber=number;
		
		int remainder=0,quotient=0;
	
		while(number>0)
		{
			remainder=number%10;
			quotient=number/10;
			sum=sum+(remainder*remainder*remainder);
			number=quotient;
		}
		if(sum==originalNumber)
		{
		 System.out.println("The number "+originalNumber+" is an Armstrong Number");
		}
		else 
		{
			 System.out.println("The number "+originalNumber+" is not an Armstrong Number");
		}
	
	}
	}


