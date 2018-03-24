package com.wpt.catchs;

public class CatchTest {

	public static void main(String[] args) {
		System.out.println(getStr());
	}
	
	public static String getStr() {
		String str = null;
		try {
			str = str.toString();
		} catch (Exception e) {
			str = "catch";
		}
		
		return str;
	}
}
