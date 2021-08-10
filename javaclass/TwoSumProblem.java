package javaclass;

public class TwoSumProblem {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int number[]={ 2, 11, 15, 7, 3,6 };
		int	target=9;

		for (int i = 0; i < number.length; i++) {
			for (int j = 1; j < number.length; j++) {
				if (number[i] + number[j] == target) {
					System.out.println("[" + i + "," + j + "]");
					System.out.println(" num1:"+ number[i]);
					System.out.println(" num2:"+ number[j]);
				}
			}
		}
	}
}

