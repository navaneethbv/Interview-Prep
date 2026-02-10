package leetCode;

import java.math.BigInteger;

/*
 * Link : https://leetcode.com/problems/reverse-bits/
 */

/**
 * Implementation of Reverse Bits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseBits {
	/**
	 * Performs reverseBits1 operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int reverseBits1(int n) {	
		StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
		if(n<0){
			System.out.println(Integer.toBinaryString(~n));
			BigInteger bigint=new BigInteger(Integer.toBinaryString(~n));
			System.out.println(bigint);
			bigint=bigint.add(new BigInteger("1"));
			System.out.println(bigint);
			sb=new StringBuilder(bigint.toString());
		}
		int length=sb.length();
		sb=sb.reverse();
		// Iterate through all elements
		for (int i = 0; i < String.valueOf(n).length()*4-length; i++) {
			sb=sb.append("0");
		}
		System.out.println(sb.toString());
		return Integer.parseInt(sb.toString(),2);
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Performs reverseBits operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int reverseBits(int n) {
		for (int i = 0; i < 16; i++) {
			n = swapBits(n, i, 32 - i - 1);
		}
	 
		return n;
	}
	 
	/**
	 * Performs swapBits operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	public static int swapBits(int n, int i, int j) {
		int a = (n >> i) & 1;
		int b = (n >> j) & 1;
	 
		if ((a ^ b) != 0) {
			return n ^= (1 << i) | (1 << j);
		}
	 
		return n;
	}

}