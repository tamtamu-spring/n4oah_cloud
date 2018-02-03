package com.n4oahCloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n4oahCloud.domain.TestDomain;

public interface TestRepository extends JpaRepository<TestDomain, Long> {
	
}