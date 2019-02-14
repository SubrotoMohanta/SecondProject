package com.project.RestSpring.VO;


import com.project.RestSpring.datamodel.PersonModel;

public class BykeVO {

  private int bkId;
	
	private String bkName;
	

	private String bkCC;


	@Override
	public String toString() {
		return "Byke [bkId=" + bkId + ", bkName=" + bkName + ", bkCC=" + bkCC + "]";
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

	
}
