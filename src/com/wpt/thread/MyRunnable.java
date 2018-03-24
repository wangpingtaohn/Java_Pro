package com.wpt.thread;

public class MyRunnable implements Runnable{

	private String mName;
	
	public MyRunnable(String threadName) {
		mName = threadName;
	}
	@Override
	public void run() {
		System.out.println(mName + "=====start run=====");
		for (int i = 0; i < 3; i++) {
			System.out.println(mName + ":" + i);
		}
		System.out.println(mName + "=====end run=====");
	}

}
