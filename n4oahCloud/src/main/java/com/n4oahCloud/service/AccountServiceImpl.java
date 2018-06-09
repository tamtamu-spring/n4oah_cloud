package com.n4oahCloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n4oahCloud.domain.Account;
import com.n4oahCloud.repository.AccountRepository;

/**
 * <pre>
 * com.n4oahCloud.service
 * TestServiceImpl.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 */

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void accountSignup(Account account) throws Exception {
		accountRepository.save(account);
	}
}