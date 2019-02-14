package com.project.RestSpring.datamodel;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;





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
	 
     @OneToOne(fetch = FetchType.LAZY, mappedBy = "prsn", cascade = CascadeType.ALL)
	 //@JoinColumn(name = "eid")
	 private EmployeeModel empMdl;

	 public EmployeeModel getEmpMdl() {
		return empMdl;
	}

	public void setEmpMdl(EmployeeModel empMdl) {
		this.empMdl = empMdl;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade=CascadeType.ALL)
	 private List <AddressModel>  addressList;

	 @OneToOne(fetch = FetchType.LAZY, mappedBy = "bkperson", cascade = CascadeType.ALL)
	 //@JoinColumn(name = "bkpersonid", referencedColumnName = "bkpersonid")
	 private BykeModel byke;
	 
     @ManyToOne(cascade=CascadeType.ALL)
     @JoinColumn(name = "accId")
 	 @Fetch(value = FetchMode.SELECT)
     private BankModel bankmdl;

    public BankModel getBankmdl() {
		return bankmdl;
	}

	public void setBankmdl(BankModel bankmdl) {
		this.bankmdl = bankmdl;
	}

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
				+ ", empMdl=" + empMdl + ", addressList=" + addressList + ", byke=" + byke + ", bankmdl=" + bankmdl
				+ "]";
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
