package com.wpt.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainTest {

	/** 
	 * @Desc: 
	 * @author wpt
	 * @since 2014-11-1 下午4:16:29 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.keySet());
		map.put("key", "value");
		Iterator<String> iterator = map.keySet().iterator();
		String key = iterator.next();
		System.out.println(key);

	}

}
