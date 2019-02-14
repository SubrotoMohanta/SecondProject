package com.project.RestSpring.datamodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="employee")
public class EmployeeModel {

	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "eid")
	 private int eid;
	 
	 @Column(name = "ename")
	 private String ename;
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "age")
	 private int age;
	 
	 @Column(name = "phone")
	 private String phone;
	 
	 @Column(name = "address")
	 private String address;
	
	 @OneToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "empid")
	 private PersonModel prsn;

	 public PersonModel getPrsn() {
		return prsn;
	}

	public void setPrsn(PersonModel prsn) {
		this.prsn = prsn;
	}

	@Override
	public String toString() {
		return "EmployeeModel [eid=" + eid + ", ename=" + ename + ", email=" + email + ", age=" + age + ", phone="
				+ phone + ", address=" + address + ", prsn=" + prsn + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
/*
	public PersonModel getPrsn() {
		return prsn;
	}

	public void setPrsn(PersonModel prsn) {
		this.prsn = prsn;
	}
	 */
	
}
