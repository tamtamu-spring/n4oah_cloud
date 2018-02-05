package com.n4oahCloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n4oahCloud.domain.Account;
import com.n4oahCloud.repository.TestRepository;

/**
 * <pre>
 * com.n4oahCloud.service
 * TestServiceImpl.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 * @Virsion		:
 */

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	TestRepository testRepository;
	
	@Override
	public List<Account> getList() {
		return testRepository.findAll();
	}
}