package com.n4oahCloud.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n4oahCloud.account.domain.Account;

public interface TestRepository extends JpaRepository<Account, Long> {
	
}