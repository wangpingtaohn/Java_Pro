package com.wpt.uml.demo;

public class UserInfo implements BaseInfo{

	public String name;
	
	public int age;
	
	public UserInfo(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void setInfo() {
		
	}

	@Override
	public String getInfo() {
		return "name=" + name + ",age=" + age;
	}

	
}
