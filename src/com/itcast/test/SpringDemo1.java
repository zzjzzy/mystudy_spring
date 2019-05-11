package com.itcast.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.dao.UserDao;

public class SpringDemo1 {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) app.getBean("userDao");
		userDao.save();
	}
}
