package com.leetcode.solutions;

public class ShuffleTheArray {

	public static void main(String[] args) {

		int n = 3;
		int[] nums = {2,5,1,3,4,7};
		int[] solution = {2,3,5,4,1,7};
		int[] newArray = shuffle(nums, n);
		int count = 0;

		for(int i = 0; i < newArray.length; i++) {
			if(solution[i] == newArray[i]) {
				count++;
			}
		}

		if(count == nums.length) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
	}

	public static int[] shuffle(int[] nums, int n) {

		int[] newArray = new int[n * 2];

		int even = 0;
		int odd = n;

		for(int i = 0; i < nums.length; i++) {
			if(i % 2 == 0) {
				newArray[i] = nums[even++];
			} else {
				newArray[i] = nums[odd++];
			}
		}

		return newArray;  
	}
}
