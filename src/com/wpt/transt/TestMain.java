package com.wpt.transt;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMain {

	/** 
	 * @Desc: 
	 * @author wpt
	 * @since 2015-5-5 下午5:39:05 
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		TestDemo demo = new TestDemo(list);
		for (int i = 0; i < 5; i++) {
			list.add(i + "");
		}
		demo.printList();
		
		System.out.println("\001");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("", null);

	}

}
