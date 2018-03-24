package com.wpt.list;


public class MyObject {
	
	private String temp;
	
	public static void main(String[] args) {
		int[] as = new int[5];
		int[] bs = new int[5];
		
		for (int i = 0; i < 5; i++) {
			as[i] = i;
			bs[i] = i *2;
		}
		bs[2] = 11;
		for (int i = 0; i < 5; i++) {
			System.out.print(as[i] + ",");
//			System.out.print(bs[i] + ",");
		}
		for (int i = 0; i < as.length; i++) {
			boolean isHas = false;
			for (int j = 0; j < bs.length; j++) {
				if (as[i] == bs[j]) {
					isHas = true;
					break;
				}
			}
			if (isHas) {
				continue;
			}
			as[i] = bs[i];
		}
		System.out.println("");
		System.out.println("================");
		for (int i = 0; i < 5; i++) {
			System.out.print(as[i] + ",");
		}
	}

}
