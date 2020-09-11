package com.leetcode.solutions;

public class DecompressRLEList {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		int[] result = new int[4];
		result = decompressList(nums);
		System.out.println(testCase(result));
	}

	public static int[] decompressList(int[] nums) {
		int length = 0;

		for(int i = 0; i < nums.length; i+=2) {
			length += nums[i];
		}

		int[] result = new int[length];
		int k = 0;
		for(int i = 0; i < nums.length - 1; i+=2){
			for(int j = 0; j < nums[i]; j++) {
				result[k] = nums[i+1];
				k++;
			}
		}

		return result;
	}
	
	public static boolean testCase(int[] result) {
		
		int[] answer = {2,4,4,4};
		
		for(int i = 0; i < result.length; i++) {
			if(answer[i] != result[i]) {
				return false;
			}
		}
		
		return true;
	}

}
