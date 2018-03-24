package com.wpt.uri;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class UriDemo {

	public static void main(String[] args) {
		

	    String urlString = "http://192.168.21.77:8080/swp/mainPage?aa=11&bb%3D22";   
	        URI uri = URI.create(urlString);   
	        System.out.println("ｕｒｉ＝" +uri.getPath());   
	        System.out.println("ｕｒｌ＝" +uri.getQuery());//解码   
	        URL url2;
			try {
				url2 = new URL(urlString);
				System.out.println("ｕｒｌ＝" +url2.getQuery());//不解码  
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}   


	}

}
