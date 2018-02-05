package com.n4oahCloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n4oahCloud.domain.Account;

/**
 * <pre>
 * com.n4oahCloud.repository
 * TestRepository.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 * @Virsion		:
 */

public interface TestRepository extends JpaRepository<Account, Long> {
	
}