package com.wpt.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int count = 0;
		while (count < 50) {
			int res = random.nextInt(3);
			System.out.println(res);
			count++;
		}

	}

}
