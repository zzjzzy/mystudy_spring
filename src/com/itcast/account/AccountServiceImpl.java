package com.itcast.account;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountServiceImpl implements AccountService {
	
	AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transfer(String from, String to, Double money) {
		accountDao.outMoney(from, money);
		accountDao.inMoney(to, money);
	}
	
	

}
