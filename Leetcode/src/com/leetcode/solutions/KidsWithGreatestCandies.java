package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		boolean[] solution = {true,true,true,false,true};
		List<Boolean> newList = kidsWithCandies(candies, extraCandies);
		int count = 0;
		
		for(int i = 0; i < candies.length; i++) {
			if(solution[i] == newList.get(i)) {
				count++;
			}
		}
		
		if(count == solution.length) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
	}
	
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = Integer.MIN_VALUE;
        
        for (int i : candies)
            max = Math.max(i, max);
        
        final List<Boolean> out = new ArrayList<>();
        
        for (int i = 0; i < candies.length; i++)
            out.add(candies[i] + extraCandies >= max);
        
        return out;
    }

}
