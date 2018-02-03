package com.n4oahCloud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestDomain {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer no;
	private String nn;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getNn() {
		return nn;
	}

	public void setNn(String nn) {
		this.nn = nn;
	}

	@Override
	public String toString() {
		return "TestDomain [no=" + no + ", nn=" + nn + "]";
	}
}