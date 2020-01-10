package com.labs1904;

import java.util.Arrays;

/**
 * The Class NextBiggestNumber.
 */
public class NextBiggestNumber {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Integer input = Integer.parseInt(args[0]);
		Integer nextBiggestNumber = getNextBiggestNumber(input);
		System.out.println("Input: " + input);
		System.out.println("Next biggest number: " + nextBiggestNumber);
	}

	/**
	 * Gets the next biggest number.
	 *
	 * @param i the i
	 * @return the next biggest number
	 */
	public static int getNextBiggestNumber(Integer i) {
		
		Integer maxNumber=getMaxNumberCombination(i);
		int nextMax = -1;
		for (int j = i + 1; j <= maxNumber; j++) {
			if (sameDigits(i, j)) {
				nextMax = j;
				break;
			}
		}
		return nextMax;
	}

	/**
	 * Gets the max number combination.
	 *
	 * @param i the i
	 * @return the max number combination
	 */
	private static int getMaxNumberCombination(Integer i) {
		char[] maxNumArr = i.toString().toCharArray();
		Arrays.sort(maxNumArr);
		return Integer.parseInt(new StringBuilder().append(maxNumArr).reverse().toString());
	}

	/**
	 * Same digits.
	 *
	 * @param firstNumber the first number
	 * @param secondNumber the second number
	 * @return true, if successful
	 */
	private static boolean sameDigits(Integer firstNumber, Integer secondNumber) {
		char[] first = firstNumber.toString().toCharArray();
		char[] second = secondNumber.toString().toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		return Arrays.equals(first, second);
	}
}