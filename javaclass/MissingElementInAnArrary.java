package javaclass;

import java.util.Arrays;
import java.util.Collections;

public class MissingElementInAnArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);
		// Sort the array

		for (int i = arr[0]; i < arr.length; i++) {
			if (i != arr[i - 1]) {
				System.out.println("The Missing Element in the given Array is: "+i);
				break;
			}

			// check if the iterator variable is not equal to the array values respectively

			// print the number

			// once printed break the iteration

		}

	}
}
