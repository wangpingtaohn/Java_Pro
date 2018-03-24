package com.wpt.math;

public class PowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] DIGITS_POWER = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		int result = (int) Math.pow(10, 6);
		int result2 = DIGITS_POWER[6];
		System.out.println(result);
		System.out.println(result2);

	}

}
