package com.wpt.clone;


public class CloneTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(15, "Tom");
		User u2 = u1;
		User u3 = (User)u1.clone();
		System.out.println("u1==u2=" + (u1 == u2));
		System.out.println("u1==u3=" + (u1 == u3));
		System.out.println("u1.equals(u2)=" + (u1.equals(u2)));
		System.out.println("u1.equals(u3)=" + (u1.equals(u3)));
		System.out.println("u1:" + u1.toString() + "\nu3=" + u3.toString());
		
		u2.age = 20;
		u3.age = 30;
		
		System.out.println("had mod u1:" + u1.toString() + "\nu3=" + u3.toString());
		
		System.out.println("==============shallow copy=====================");
		
		ShallwCopy a1 = new ShallwCopy(u1, 10000);
		ShallwCopy a2 = a1;
		ShallwCopy a3 = (ShallwCopy) a1.clone();
		
		System.out.println("a1==a2=" + (a1 == a2));
		System.out.println("a1==a3=" + (a1 == a3));
		System.out.println("a1.equals(a2)=" + (a1.equals(a2)));
		System.out.println("a1.equals(a3)=" + (a1.equals(a3)));
		System.out.println("a1.user==a3.user=" + (a1.user == a3.user));
		System.out.println("a1:" + a1.toString() + "\na3=" + a3.toString());
		a3.user.age = 40;
		System.out.println("had mod a1:" + a1.toString() + "\na3=" + a3.toString());
		
		System.out.println("=============deep copy=====================");
		
		DeepCopy d1 = new DeepCopy(u1, 10000);
		DeepCopy d2 = d1;
		DeepCopy d3 = (DeepCopy) d1.clone();
		
		System.out.println("d1==d2=" + (d1 == d2));
		System.out.println("d1==d3=" + (d1 == d3));
		System.out.println("d1.equals(d2)=" + (d1.equals(d2)));
		System.out.println("d1.equals(d3)=" + (d1.equals(d3)));
		System.out.println("d1.user==d3.user=" + (d1.user == d3.user));
		System.out.println("d1:" + d1.toString() + "\nd3=" + d3.toString());
		d3.user.age = 50;
		System.out.println("had mod d1:" + d1.toString() + "\nd3=" + d3.toString());

	}

}
