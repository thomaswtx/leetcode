package com.leetcode.solutions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int x = 172523;
		int newX = reverse(x);
		
		System.out.println("x: " + x);
		System.out.println("reversed x: " + newX);

	}

	public static int reverse(int x) {

		long temp = 0;
		int sign = x < 0 ? -1 : 1;

		x = Math.abs(x);

		while(x > 0) {
			temp *= 10;
			temp += (x % 10);
			x /= 10;
		}

		temp *= sign;        

		if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) temp;
		}

	}

}
