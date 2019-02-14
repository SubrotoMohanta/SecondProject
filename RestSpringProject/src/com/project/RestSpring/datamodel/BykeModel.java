package com.project.RestSpring.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "byke")
public class BykeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bkid")
	private int bkId;
	
	@Column(name = "bkname")
	private String bkName;
	
	@Column(name = "bkcc")
	private String bkCC;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bkpersonid")
	private PersonModel bkperson;

	@Override
	public String toString() {
		return "BykeModel [bkId=" + bkId + ", bkName=" + bkName + ", bkCC=" + bkCC + ", bkperson=" + bkperson + "]";
	}

	public int getBkId() {
		return bkId;
	}

	public void setBkId(int bkId) {
		this.bkId = bkId;
	}

	public String getBkName() {
		return bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public String getBkCC() {
		return bkCC;
	}

	public void setBkCC(String bkCC) {
		this.bkCC = bkCC;
	}

	public PersonModel getBkperson() {
		return bkperson;
	}

	public void setBkperson(PersonModel bkperson) {
		this.bkperson = bkperson;
	}

	

}
