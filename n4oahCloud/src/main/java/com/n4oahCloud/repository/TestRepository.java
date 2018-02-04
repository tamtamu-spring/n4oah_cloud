package com.n4oahCloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n4oahCloud.domain.Account;

public interface TestRepository extends JpaRepository<Account, Long> {
	
}