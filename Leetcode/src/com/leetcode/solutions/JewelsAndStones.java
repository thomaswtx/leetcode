package com.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
	
	/*
	 You're given strings J representing the types of stones that are jewels, 
	 and S representing the stones you have.  Each character in S is a type of stone you have.  
	 You want to know how many of the stones you have are also jewels. The letters in J are 
	 guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, 
	 so "a" is considered a different type of stone from "A".	  
	 */

	public static void main(String[] args) {
		
		String J = "aA";
		String S = "aAAbbbb";
		
		int expected = 3;
		
		if(expected == (numJewelsInStones(J, S))) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

	}

	public static int numJewelsInStones(String J, String S) {


		Set<Character> set = new HashSet<>(50);
		int count = 0;
		for(int i = 0; i < J.length(); i++){
			set.add(J.charAt(i));
		}
		for(int i = 0; i < S.length(); i++){
			if(set.contains(S.charAt(i))){
				count++;
			}
		}
		return count;
	}
}
