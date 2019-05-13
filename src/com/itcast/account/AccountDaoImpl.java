package com.itcast.account;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl  implements AccountDao {

	public void outMoney(String from, Double money) {
		// 调用jdbcTemplate操作数据库，电脑暂时没有数据库，先不做了。
		System.out.println("从"+from+"转出"+money+"元成功");

	}

	public void inMoney(String to, Double money) {
		// 调用jdbcTemplate操作数据库，电脑暂时没有数据库，先不做了。
		System.out.println("转入"+to+"账户中"+money+"元成功");

	}

}

//public class AccountDaoImpl implements AccountDao {
//	
//	JdbcTemplate jdbcTemplate;
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	public void outMoney(String from, Double money) {
//		// 调用jdbcTemplate操作数据库，电脑暂时没有数据库，先不做了。
//		System.out.println("从"+from+"转出"+money+"元成功");
//
//	}
//
//	public void inMoney(String to, Double money) {
//		// 调用jdbcTemplate操作数据库，电脑暂时没有数据库，先不做了。
//		System.out.println("转入"+to+"账户中"+money+"元成功");
//
//	}
//
//}
