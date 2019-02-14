package com.project.RestSpring.datamodel;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Bank")
public class BankModel {

	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "accid")
	 private int accId;
	 	
	 @Column(name = "accName")
	 private String accName;
	 
	 @Column(name = "acctype")
	 private String accType;
	 
	 @Column(name = "bankName")
	 private String bankName;
	 
	 @OneToMany(fetch = FetchType.EAGER, mappedBy = "bankmdl", cascade=CascadeType.ALL)
	 private List <PersonModel>  personModel;

	@Override  
	public String toString() {
		return "BankModel [accId=" + accId + ", accName=" + accName + ", accType=" + accType + ", bankName=" + bankName
				+ ", personModel=" + personModel + "]";
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<PersonModel> getPersonModel() {
		return personModel;
	}

	public void setPersonModel(List<PersonModel> personModel) {
		this.personModel = personModel;
	}

	  
}
