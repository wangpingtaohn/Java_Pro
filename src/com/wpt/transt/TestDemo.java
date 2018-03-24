package com.wpt.transt;

import java.util.ArrayList;

public class TestDemo {
	
	private ArrayList<String> mList;
	
	public TestDemo(ArrayList<String> list) {
		mList = list;
		mList.add("test");
	}
	
	public void printList(){
		System.out.println(mList);
	}

}
