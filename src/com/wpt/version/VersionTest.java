package com.wpt.version;

public class VersionTest {

	public static void main(String[] args) {
		
		int oldVerCode = 6240;
		int newVerCode = 61240;
		String oldVerName = "6.20.4.0";
		String newVerName = "6.12.4.0";
		
		String newVerCodeStr = String.valueOf(newVerCode);
		int result = newVerName.compareTo(oldVerName);
		System.out.println("result=" + result);
		
		char[] chars = String.valueOf(newVerCode).toCharArray();
		String ver = "";
		for (int i = 0;i < chars.length;i++){
            if (i != chars.length - 1){
            	ver += chars[i] + ".";
            } else {
            	ver += chars[i];
            }
        }
		System.out.println("result=" + ver);
		
		
		//两位数的版本号
		int versionCode = 2034001;
		String versionName = "";
		int temp = versionCode;
		for(int i = 3;i >=0;i--){
			int m = (int) (temp / Math.pow(100, i));
			versionName +=  m + ".";
			temp = (int) (temp % (m * (Math.pow(100, i))));
		}
		
		System.out.println("versionName=" + versionName);

	}

}
