package com.project.RestSpring.VO;

import java.io.Serializable;
import java.util.List;


public class PersonVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1412126571498063621L;
	
	private String pname;
	private String email;
	private String age;
	private String phone;
	private List<AddressVO> addressVOList;
	private EmployeeVO empvo;
	private BykeVO bykevo;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public BykeVO getBykevo() {
		return bykevo;
	}
	public void setBykevo(BykeVO bykevo) {
		this.bykevo = bykevo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public EmployeeVO getEmpvo() {
		return empvo;
	}
	public void setEmpvo(EmployeeVO empvo) {
		this.empvo = empvo;
	}
	public List<AddressVO> getAddressVOList() {
		return addressVOList;
	}
	public void setAddressVOList(List<AddressVO> addressVOList) {
		this.addressVOList = addressVOList;
	}
	@Override
	public String toString() {
		return "PersonVO [pname=" + pname + ", email=" + email + ", age=" + age + ", phone=" + phone
				+ ", addressVOList=" + addressVOList + ", empvo=" + empvo + ", bykevo=" + bykevo + "]";
	}
	
	
	
}
