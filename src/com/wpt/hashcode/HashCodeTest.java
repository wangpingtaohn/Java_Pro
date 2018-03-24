package com.wpt.hashcode;

public class HashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		User u2 = new User();
		System.out.println("u1=" + u1.hashCode());
		System.out.println("u2=" + u2.hashCode());
		System.out.println("u1==u2:" + (u1 == u2));
		System.out.println("u1.hashCode==u2.hashCode:" + (u1.hashCode() == u2.hashCode()));
		System.out.println("u1.equals(u2):" + (u1.equals(u2)));

	}

}
