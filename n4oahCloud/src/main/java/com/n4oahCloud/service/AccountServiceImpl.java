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

	@Override
	public int overlapCheck(Account account) throws Exception {
		int res = 0;
		
		if (accountRepository.findById(account.getId()) != null) {
			res = 1;
		}
		else if (accountRepository.fidByEmail(account.getEmail()) != null) {
			res = 2;
		}
		
		return res;
	}
}