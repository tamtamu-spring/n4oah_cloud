package com.n4oahCloud.service;

import com.n4oahCloud.domain.Account;

/**
 * <pre>
 * com.n4oahCloud.service
 * TestService.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 */

public interface AccountService {
	public void accountSignup(Account account) throws Exception;
	public int overlapCheck(Account account) throws Exception;
	public Account signin(Account account) throws Exception;
}