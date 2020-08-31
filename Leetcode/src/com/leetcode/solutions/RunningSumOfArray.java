package com.leetcode.solutions;

public class RunningSumOfArray {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4};
		int[] solution = {1, 3, 6, 10};
		int[] newArray = runningSum(nums);
		int count = 0;

		for(int i = 0; i < newArray.length; i++) {
			if(solution[i] == newArray[i]) {
				count++;
			}
		}
		if(count == 4) {
			System.out.println("Passed!");
		}
	}

	public static int[] runningSum(int[] nums) {

		int[] sumArray = new int[nums.length];

		for(int i = 0; i < nums.length; i++) {

			if(i == 0) {
				sumArray[0] = nums[0];
			} else {
				sumArray[i] = sumArray[i-1] + nums[i];
			}

		}
		return sumArray;
	}
}
