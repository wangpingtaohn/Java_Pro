package com.wpt.thread.join;

public class JoinMain2 {
	
	public static void main(String[] args) {
		final Thread A = new Thread(new Runnable() {
			public void run() {
				printTest("A");
			}
		});
		
		Thread B = new Thread(new Runnable() {
			public void run() {
				try {
					A.join();//此处加入join，表示先执行完A线程后再执行此后面的语句
					printTest("B");
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
			count++;
			System.out.println(threadName + "==" + count);
		}
		
	}

}
