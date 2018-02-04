package com.n4oahCloud.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n4oahCloud.account.domain.Account;
import com.n4oahCloud.account.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	TestRepository testRepository;
	
	@Override
	public List<Account> getList() {
		return testRepository.findAll();
	}
}