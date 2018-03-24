package com.wpt.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {

	public static void main(String[] args) {
		MyRunnable run1 = new MyRunnable("myRun1");
		MyRunnable run2 = new MyRunnable("myRun2");
		MyRunnable run3 = new MyRunnable("myRun3");
		
//		ExecutorService executor = Executors.newFixedThreadPool(2);
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newCachedThreadPool();
//		ExecutorService executor = Executors.newScheduledThreadPool(2);
		executor.execute(run1);
		executor.execute(run2);
		executor.execute(run3);
		
		executor.shutdown();
		
//		executor.shutdown();

	}

}
