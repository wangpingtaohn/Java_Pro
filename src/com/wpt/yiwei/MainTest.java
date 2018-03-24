package com.wpt.yiwei;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//无符号右移，忽略了符号位的扩展,0补最高位
		int i = 12;//00001100
		int j = i >>> 2;//00000011 3
		System.out.println("j=" + j);
		
		//负数转换二进制：1.将10进制转换为二进制 2.对该二进制求反 3.再将该二进制加1
		int a = -12;//1.00001100 2.11110011 3.11110100
		int b = a >>> 2;//
		System.out.println("b=" + b);

	}

}
