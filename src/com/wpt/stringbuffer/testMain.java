package com.wpt.stringbuffer;

import java.util.ArrayList;
import java.util.List;

public class testMain {

	public static void main(String[] args) {
		
		String temp = "111";
		List<String> list = new ArrayList<String>();
		list.add(temp);
		temp = "222";
		list.add(temp);
		System.out.println(list.toString());
		
		StringBuffer temp2 = new StringBuffer();
		temp2.append("111");
		List<StringBuffer> list2 = new ArrayList<StringBuffer>();
		list2.add(temp2);
		System.out.println(list2.toString());
		temp2.replace(0, "111".length(), "222");
		System.out.println(temp2);
		list2.add(temp2);
		System.out.println(list2.toString());
	}

}
