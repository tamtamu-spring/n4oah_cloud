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
 */

/*
 * JpaRepository 제네릭 : <Entity클래스, PK타입>을 넣어주면 기본적인 CRUD 메소드가 자동으로 생성된다.
 */

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}