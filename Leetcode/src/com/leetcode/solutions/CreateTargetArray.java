package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {

	public static void main(String[] args) {

		int[] nums = {0, 1, 2, 3, 4};
		int[] index = {0, 1, 2, 2, 1};
		int[] result = new int[nums.length];
				
		result = createTargetArray(nums, index);	
		System.out.println(testCase(result));	

	}

	public static int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);  
        }
        
        for(int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        
        return target;
	}
	
	public static boolean testCase(int[] result) {
		
		int[] answer = {0, 4, 1, 3, 2};
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] != answer[i]) {
				return false;
			}
		}
		return true;
	}

}
