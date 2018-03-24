package com.wpt.hashcode;

import java.util.HashMap;

public class HashFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 17; i++) {
			System.out.println("hashCode=" + ((Object)i).hashCode());
			System.out.println("index_" + i + ":" + hash(i + ""));
		}
		

	}
	
	public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
