package com.n4oahCloud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * <pre>
 * com.n4oahCloud.domain
 * Account.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 */

/*
 * @Entity : 테이블과 맵핑될 클래스임을 나타내는 어노테이션
 * @Id : Primary Key임을 나타내는 어노테이션
 * @GeneratedValue : 기본 값은 auto_increment
 * @Column : 테이블 컬럼임을 나타내는 어노테이션
 */

@Entity
@javax.persistence.Table(name="account")
@Table(comment="회원관리", appliesTo = "account")
public class Account {
	@Id
	@Column(columnDefinition="INT(10) UNSIGNED COMMENT '회원 고유 번호'", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer no;
	@Column(columnDefinition="VARCHAR(50) COMMENT '회원 아이디'", nullable=false)
	private String id;
	@Column(columnDefinition="VARCHAR(128) COMMENT '회원 비밀번호'", nullable=false)
	private String pwd;
	@Column(columnDefinition="VARCHAR(50) COMMENT '회원 이름'", nullable=false)
	private String name;
	@Column(columnDefinition="VARCHAR(150) COMMENT '회원 이메일'", nullable=false)
	private String email;
	@Column(columnDefinition="VARCHAR(50) COMMENT 'GOOGLE | NAVER'", nullable=true)
	private String loginApi;
	@Column(columnDefinition="VARCHAR(128) COMMENT '로그인 API 아이디'", nullable=true)
	private String loginApiId;
	@Column(columnDefinition="VARCHAR(128) COMMENT '로그인 API 토큰'", nullable=true)
	private String loginApiAccessToken;
	
	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLoginApiId() {
		return loginApiId;
	}

	public void setLoginApiId(String loginApiId) {
		this.loginApiId = loginApiId;
	}

	public String getLoginApiAccessToken() {
		return loginApiAccessToken;
	}

	public void setLoginApiAccessToken(String loginApiAccessToken) {
		this.loginApiAccessToken = loginApiAccessToken;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", loginApi=" + loginApi
				+ ", loginApiId=" + loginApiId + ", loginApiAccessToken=" + loginApiAccessToken + "]";
	}
}