package com.wpt.statics;


public class MainTest {

	/**
	 * @Description: 
	 * @author wpt
	 * @since 2014-10-11 下午3:05:52 
	 * @param args
	 */
	public static void main(String[] args) {
		String ss = Test.Test01.temp;
		MyTest myTest = new MyTest();
//		myTest.temp;
		System.out.println(myTest.temp);
	}

	private static class MyTest{
		public String temp = "myTest";
	}
}
