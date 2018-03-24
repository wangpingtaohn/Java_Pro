package com.wpt.statics;

public class Test {

	public Test() {
		Test01 tt = new Test01();
		System.out.println(tt.temp);
	}
	
	static class Test01{
		public Test01() {
		}
		static String temp = "hello";
	}
}
