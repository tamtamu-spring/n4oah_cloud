package com.n4oahCloud.repository;

import org.springframework.data.repository.Repository;

import com.n4oahCloud.domain.TestDomain;

public interface TestRepository extends Repository<TestDomain, Long> {
	
}