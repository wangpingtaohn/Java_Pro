package com.wpt.messagedigest;

import java.security.MessageDigest;

public class DemoMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str1 = "qwertyuiop";
		String str2 = "qwertyuioP";
		
		MessageDigest md1 = MessageDigest.getInstance("md5");
		MessageDigest md2 = MessageDigest.getInstance("md5");
		System.out.println("md1 == md2:" + (md1 == md2));
		md1.update(str1.getBytes());
		md2.update(str2.getBytes());
		boolean isEqual = MessageDigest.isEqual(md1.digest(), md2.digest());
		System.out.println("isEqual=" + isEqual);

	}

}
