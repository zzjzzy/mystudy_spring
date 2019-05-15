package com.itcast.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.account.AccountService;
import com.itcast.dao.UserDao;
import com.itcast.domain.User;

public class SpringDemo1 {

	public static void main(String[] args) {
		//张中建
//		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserDao userDao = (UserDao) app.getBean("userDao");
//		userDao.save();
//		User user = (User) app.getBean("user");
//		System.out.println(user);
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accountService = (AccountService) app.getBean("accountService");
		accountService.transfer("张中建", "李四", 100.0);
	}
}
