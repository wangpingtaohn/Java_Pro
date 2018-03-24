package com.wpt.quote;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		int count = 0;
		while (count <= 5001) {
			str.append("," + count);
			count++;
			
		}
//		change(str);
		System.out.println(str);
	}
	
	private static void change(String str){
		str = "456";
	}

}
