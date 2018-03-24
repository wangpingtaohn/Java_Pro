package com.wpt.replace;

public class RepalceTest {

	public static void main(String[] args) {
		String key = "76QDURWFOSGX5SE5";
		String encryKey = "";
		char[] chars = key.toCharArray();
		int startIndex = 3;
		int endIndex = key.length() - 4;
		for (int i = 0; i < key.length(); i++) {
			if (i >= startIndex && i <= endIndex) {
				encryKey += "*";
			} else {
				encryKey += chars[i];
			}
		}
		System.out.println(encryKey);

	}

}
