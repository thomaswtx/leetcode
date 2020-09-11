package com.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;

public class MergeNames {

	public static void main(String[] args) {
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));

	}
	
	public static String[] uniqueNames(String[] names1, String[] names2) {
		
		Set<String> newSet = new HashSet<String>();
		
		for(int i = 0; i < names1.length; i++) {
			newSet.add(names1[i]);
			newSet.add(names2[i]);
		}
		
		String[] newArray = new String[newSet.size()];
		int count = 0;
		for(String s : newSet) {
			newArray[count] = s;
			count++;
		}	
		
		return newArray;
	}
	

}
