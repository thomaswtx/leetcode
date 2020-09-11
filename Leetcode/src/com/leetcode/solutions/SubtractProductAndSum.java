package com.leetcode.solutions;

public class SubtractProductAndSum {

	public static void main(String[] args) {
		int n = 234;	
		int result = subtractProductAndSum(n);
		System.out.println(testCase(result));
	}
	
	public static int subtractProductAndSum(int n) {
		int product = 1;
		int sum = 0;
		
		while(n > 0) {
			product *= n%10;
			sum += n%10;
			n /= 10;
		}
		return product - sum;
	}
	
	public static boolean testCase(int result) {
		if(result == 15) {
			return true;
		} else {
			return false;
		}
	}

}
