package com.wpt.thread.wait;

public class WaitDemo {
	
	static Object object = new Object();
	static Thread A;
	static Thread B;

	public static void main(String[] args) {
		A = new Thread(new Runnable() {
			public void run() {
				synchronized (object) {
					
					try {
						object.wait();
						printTest("A");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
				}
			}
		});
		
		B = new Thread(new Runnable() {
			public void run() {
				try {
//					A.join();
					printTest("B");
					synchronized (object) {
						object.notify();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		A.start();
		B.start();
	}
	
	public static void printTest(String threadName){
		int count = 0;
		while(count < 5){
//			if ("A".equals(threadName) && count == 2) {
//					try {
//						object.wait();
////						A.notify();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//			}
			System.out.println(threadName + "==" + count);
			count++;
		}
//		if ("A".equals(threadName)) {
//			synchronized (object) {
//				object.notify();
//			}
//		}
		
	}

}
