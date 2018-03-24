package com.wpt.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMainDemo {

	/** 
	 * @Desc: 
	 * @author wpt
	 * @since 2015-7-27 下午4:53:00 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("D:\\","test.txt");
		System.out.println("file=" + file);
		
		InputStream in = new FileInputStream(file);
		
		File dir = new File("D:\\","wuba_wpt");
		if (!dir.exists()) {
			dir.mkdirs();
		}
//		file.createNewFile();
		File des = new File(dir, "test11.json");
		store(dir, des,in);
		File dirs = new File("D:\\","wuba_Wpt");
		if (!dirs.exists()) {
			dirs.mkdirs();
		}
		File des2 = new File(dirs, "test22.json");
		store(dirs, des2, in);
//		des2.createNewFile();

	}
	
	public static void store(File fileDir,File saveFile, InputStream is) {
        File file = new File(fileDir, "testFile.json.temp");
        OutputStream os = null;
        try {
            os = new BufferedOutputStream(new FileOutputStream(file));

            byte[] b = new byte[2048];
            int count;
            int total = 0;

            while ((count = is.read(b)) > 0) {
                if(Thread.currentThread().isInterrupted()){
                    os.close();
                    throw new IOException("the download is canceled!");
                }

                os.write(b, 0, count);
                total += count;
            }
            os.flush();
            if (!fileDir.exists()) {
				fileDir.mkdirs();
			}
            if(!saveFile.exists()){
            	saveFile.createNewFile();
            }
            file.renameTo(saveFile);
        } catch (Exception e) {
        	System.out.println("e=" + e.getMessage());
        } finally {
            if(os != null) {
                try {
                    os.close();
                } catch (IOException e1) {
                    //
                }
            }
            if(file.exists()){
                file.delete();
            }
        }
    }

}
