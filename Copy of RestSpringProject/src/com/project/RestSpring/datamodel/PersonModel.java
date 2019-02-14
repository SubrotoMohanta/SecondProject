package com.project.RestSpring.datamodel;

import java.util.List;

import javax.persistence.*;





@Entity
@Table(name="person")
public class PersonModel {

	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "pid")
	 private int pid;
	 
	 @Column(name = "pname")
	 private String pname;
	 
	 @Column(name = "email")
	 private String email;
	 
	 @Column(name = "age")
	 private int age;
	 
	 @Column(name = "phone")
	 private String phone; 
	 
     /*@OneToOne
	 @JoinColumn(name = "eid")
	 private EmployeeModel empMdl;*/

	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade=CascadeType.ALL)
	 private List <AddressModel>  addressList;

	 @OneToOne(fetch = FetchType.LAZY, mappedBy = "bkperson", cascade = CascadeType.ALL)
	// @JoinColumn(name = "bid", referencedColumnName = "bid")
	 private BykeModel byke;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	
	public List<AddressModel> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressModel> addressList) {
		this.addressList = addressList;
	}

	public BykeModel getByke() {
		return byke;
	}

	public void setByke(BykeModel byke) {
		this.byke = byke;
	}

	@Override
	public String toString() {
		return "PersonModel [pid=" + pid + ", pname=" + pname + ", email=" + email + ", age=" + age + ", phone=" + phone
				+ ", addressList=" + addressList + ", byke=" + byke + "]";
	}
	
	
	
	/*public EmployeeModel getEmpMdl() {
		return empMdl;
	}

	public void setEmpMdl(EmployeeModel empMdl) {
		this.empMdl = empMdl;
	}*/

	

	/*public List<AddressModel> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressModel> addressList) {
		this.addressList = addressList;
	}*/

	

	 
}
