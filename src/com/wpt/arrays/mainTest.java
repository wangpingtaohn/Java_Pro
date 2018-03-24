package com.wpt.arrays;

import java.util.ArrayList;

public class mainTest {

	/** 
	 * @Desc: 
	 * @author wpt
	 * @since 2015-1-5 下午10:18:40 
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			array.add(i + "");
		}
		
		ArrayList<String>[] arrays = new ArrayList[2];
		
		int aaa = 0;
		for (int i = 0; i < 5; i++) {
			if (aaa++ < 3) {
				System.out.println("aaa=" + aaa);
				if (aaa++ < 3) {
					System.out.println("aaa2=" + aaa);
				}
			}
		}
		

	}

}
