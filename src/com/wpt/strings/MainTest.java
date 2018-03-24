package com.wpt.strings;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		
		String s4 = new String("hello").intern();
		String s5 = "hello";
		System.out.println("s4==s5:" + (s4 == s5));
		
		String s11 = "ab123" ;  
        String s22 = new String( "ab123" ) ;  
        System.out.println( s11 == s22 );   
        String s33 = s22.intern() ;   
        System.out.println( s11 == s33 ) ;
        
        String s111="Good";
        s111=s111+"morning";
        System.out.println(s111.intern());
       
        String s222="Goodmorning";
        System.out.println(s111==s222);
	}

}
