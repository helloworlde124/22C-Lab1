/*
 * Lab 1: Iteration vs Recursion demo lab
 * 
 * @authors: Tom Ekshtein, 
 */

import java.util.Scanner;

public class recursionIteration {
	static final int SORT_MAX_SIZE = 16;
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length (up to 16): ");
		
		int arrLength = scan.nextInt();
		if (arrLength > SORT_MAX_SIZE) {
			arrLength = SORT_MAX_SIZE;
		}
		int[] arr = new int[arrLength];
		
		
		System.out.println("Enter array contents using spaces to separate numbers (1-9999 inclusive): ");
		for (int i = 0; i < arrLength; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		//iteration
		boolean primeIterCheck = IsArrayPrimeIter(arr, arrLength);
		if (primeIterCheck)
			System.out.println("Prime array using iteration");
		else
			System.out.println("Not prime array using iteration");
		
		
	}
	
	/*
	 * Iteratively checks to see if the element in array is prime
	 * by checking to see if there is any number which will cause
	 * a remainder of 0 when dividing by the element.
	 * 
	 * 
	 * 
	 * add pseducode
	 * 
	 * @param arr  array of ints
	 * @param size  size of array
	 * @return true if each element in the array is prime
	 */
	public static boolean IsArrayPrimeIter(int[] arr, int size) {
		System.out.println("Entering IsArrayPrimeIter");
		boolean primeFlag = true;
		
		for (int i = 0; i < size; i++) {
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					primeFlag = false;
					break;
				}
			}
		}
		
		System.out.println("Leaving IsArrayPrimeIter");
		return primeFlag;
	}
	
	/*
	 * add desc
	 * add pseducode
	 */
	public static boolean IsArrayPrimeRecur(int[] arr) {
		System.out.println("Entering IsArrayPrimeRecur");
		
		
		System.out.println("Leaving IsArrayPrimeRecur");
		return false;
	}
	
	/*
	 * add desc
	 * add pseducode
	 */
	public static void IsPrimeRecur(int num, int divisor) {
		System.out.println("Entering IsPrimeRecur");
		
		System.out.println("Leaving IsPrimeRecur");
	}
}
