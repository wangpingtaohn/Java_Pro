package com.wpt.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		 final File sFile = new File("d:\\test.txt");  
		 File dFile1 = new File("d:\\testCopy.txt");
		 if (!sFile.exists()) {
			try {
				sFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count < 10 * 10000){
					count++;
					System.out.println(sFile.getAbsolutePath() + "--" + count);
				}
			}
		}).start();
//		 sFile.renameTo(dFile1);
//		 sFile.delete();
	}

}
