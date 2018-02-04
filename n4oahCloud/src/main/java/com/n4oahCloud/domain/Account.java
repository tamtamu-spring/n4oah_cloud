package com.n4oahCloud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name="account")
@Table(comment="회원관리", appliesTo = "account")
public class Account {
	@Id
	@Column(columnDefinition="INT(10) UNSIGNED COMMENT '회원 고유 번호'", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(columnDefinition="VARCHAR(50) COMMENT '회원 이름'", nullable=false)
	private String name;
	@Column(columnDefinition="VARCHAR(150) COMMENT '회원 이메일'", nullable=false)
	private String email;
	@Column(columnDefinition="VARCHAR(50) COMMENT 'GOOGLE | NAVER | KAKAO'", nullable=false)
	private String loginApi;
	@Column(columnDefinition="VARCHAR(128) COMMENT ''", nullable=false)
	private String loginApiId;
	@Column(columnDefinition="VARCHAR(128) COMMENT ''", nullable=false)
	private String loginApiAccessToken;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginApi() {
		return loginApi;
	}

	public void setLoginApi(String loginApi) {
		this.loginApi = loginApi;
	}
}