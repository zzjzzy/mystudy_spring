package com.itcast.dao;

public class UserDaoImple implements UserDao {
	
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void save() {
		System.out.println("UserDaoImpl执行了！"+name);

	}

}
