package com.leetcode.solutions;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] expected = {0, 1};
		int[] newArray = twoSum(nums, target);
		int count = 0;
		
		for(int i = 0; i < expected.length; i++) {
			if(expected[i] == newArray[i]) {
				count++;
			}
		}
		
		if(count == expected.length) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

	}
	
    public static int[] twoSum(int[] nums, int target) {
        
        int[] solution = new int[2];
        
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }

}
