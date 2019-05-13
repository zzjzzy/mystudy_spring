package com.itcast.dao;

public class UserDaoImple implements UserDao {
	
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String save() {
		System.out.println("save方法执行了"+name);
		return "UserDao save方法";

	}

}
