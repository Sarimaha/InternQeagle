package javaclass;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		int secondLargNumber;
		int len=data.length;
		Arrays.sort(data);
		//for(int i=0;i<len;i++)
		//{
			//System.out.println(data[i]);
			
		//}
		secondLargNumber=data[len-2];
		System.out.println("The second Largest Number in the given array is: "+secondLargNumber);
	}

}
