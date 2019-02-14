package com.project.RestSpring.VO;

import java.util.List;



public class BankVO {

	 private int accId;
	 	
	 private String accName;

	 private String accType;

	 private String bankName;

	 private List <PersonVO>  personvo;

	@Override
	public String toString() {
		return "BankVO [accId=" + accId + ", accName=" + accName + ", accType=" + accType + ", bankName=" + bankName
				+ ", personvo=" + personvo + "]";
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

	public List<PersonVO> getPersonvo() {
		return personvo;
	}

	public void setPersonvo(List<PersonVO> personvo) {
		this.personvo = personvo;
	}
	
}
