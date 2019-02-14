package com.project.RestSpring.VO;

import javax.persistence.Column;

import com.project.RestSpring.datamodel.PersonModel;

public class EmployeeVO {

     private int eid;
	 
	 private String ename;
	 
	 private String email;
	 
	 private int age;
	 
	 private String phone;
	 
	 private String address;
	 
	 private PersonModel prsn;

	@Override
	public String toString() {
		return "EmployeeVO [eid=" + eid + ", ename=" + ename + ", email=" + email + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + ", prsn=" + prsn + "]";
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

	public PersonModel getPrsn() {
		return prsn;
	}

	public void setPrsn(PersonModel prsn) {
		this.prsn = prsn;
	}
	 

}
