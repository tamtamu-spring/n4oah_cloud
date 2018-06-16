package com.n4oahCloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

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

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	@Query(value="SELECT a.id FROM #{#entityName} a WHERE a.id=:id")
	public String findById(String id);
	
	@Query(value="SELECT a.email FROM #{#entityName} a WHERE a.email=:email")
	public String fidByEmail(String email);
	
	@Query(value="SELECT a FROM #{#entityName} a WHERE a.id=:id AND a.pwd=:pwd")
	public Account findByIdAndPassword(@Param("id") String id, @Param("pwd") String pwd);
}