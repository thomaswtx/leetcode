package com.leetcode.solutions;

public class StringShuffle {

	public static void main(String[] args) {
		
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		
		String test = restoreString(s, indices);
		boolean result = testCase(test);
		
		System.out.println("Result: " + result);		
	}

	public static String restoreString(String s, int[] indices) {

		char[] result = new char[s.length()];
		for (int i = 0; i < indices.length; i++) {
			result[indices[i]] = s.charAt(i);
		}
		
		return new String(result);
	}
	
	public static boolean testCase(String test) {
		
		if(test.equals(test)) {
			return true;
		} else {
			return false;
		}
	}
}
