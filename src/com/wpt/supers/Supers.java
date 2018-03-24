package com.wpt.supers;

public abstract class Supers {

	private String testStr;
	
	public void Test1(){
		if (testStr == null) {
			testStr = this.getClass().getName();
		}
		System.out.println("testStr=" + testStr);
	}
}
