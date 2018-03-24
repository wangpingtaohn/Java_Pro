package com.wpt.throwss;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		} catch (SubExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("MyException_e:" + e);
		} catch (Exception e) {
			System.out.println("Exception_e:" + e);
		}

	}
	
	
	private static void test() throws Exception{
		subTest();
	}
	
	private static void subTest() throws MyException{
		throw new SubExcption();
	}

}
