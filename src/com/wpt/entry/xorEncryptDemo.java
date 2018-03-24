package com.wpt.entry;

public class xorEncryptDemo {

	/** 
	 * @Desc: 
	 * @author wpt
	 * @since 2015-3-6 下午3:04:14 
	 * @param args
	 */
	public static final char CH = '1'; 
	
	public static void main(String[] args) {
		
		String encrypt = xorEncryptStr("wpt0123");
		System.out.println("encrypt=" + encrypt);
		String dencrypt = xorEncryptStr(encrypt);
		System.out.println("dencrypt=" + dencrypt);

	}
	
	private static String xorEncryptStr(String str){
		StringBuffer sb = new StringBuffer();
		if (str == null) {
			return null;
		}
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char temp = chars[i];
			sb.append((char)(temp ^ CH));
		}
		return sb.toString();
	}
}
