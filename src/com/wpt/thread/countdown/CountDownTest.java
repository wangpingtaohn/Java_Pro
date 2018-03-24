package com.wpt.thread.countdown;

import java.util.concurrent.CountDownLatch;

public class CountDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int worker = 3;
		final CountDownLatch countDownLatch = new CountDownLatch(worker);
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("D is waiting for other three threads");
				try {
					countDownLatch.await();
					System.out.println("All done，D start Run");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		for (char threadName = 'A'; threadName <= 'C'; threadName++) {
			final String sn = String.valueOf(threadName);
			new Thread(new Runnable() {
				public void run() {
					
					System.out.println(sn + "finish");
					countDownLatch.countDown();
				}
			}).start();
		}

	}

}
