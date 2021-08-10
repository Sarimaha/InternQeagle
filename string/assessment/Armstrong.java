package com.string.assessment;

public class Armstrong {
	//4 digits armstrong number- 1634, 8208, 9474 
	//3 digits - 153, 370, 371, 407.
	
	int count;
	public static void main(String args[])
	{
		Armstrong obj=new Armstrong();

		int number=67;
		int originalNumber=number;
		//int num=number;
		int remainder=0;
		int quotient=0;
		int result;
		int sum=0;

		obj.noOfDigits(number);
		System.out.println("count of the digits is: "+obj.count);
		while(number>0)
		{
			remainder=number%10;//3
			quotient=number/10; //15
			result=(int) Math.pow(remainder,obj.count);		
			sum=sum+result;
			number=quotient;
		}
		//System.out.println("sum"+sum);

		if(sum==originalNumber) {
			System.out.println("The number "+originalNumber+" is an Armstrong Number"); }
		else {
			System.out.println("The number "+originalNumber+" is not an Armstrong Number");
		}

	}	
	public int noOfDigits(int number) {

		//int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		//	System.out.println("count is:" + count);
		return count;
	}


}
