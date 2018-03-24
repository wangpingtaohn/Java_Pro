package com.wpt.clone;

public class User implements Cloneable{
	public int age;
	public String name;
	
	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", hashCode()=" + hashCode() + "]";
	}
	
}
