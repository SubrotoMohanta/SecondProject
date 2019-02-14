package com.project.RestSpring.VO;

import com.project.RestSpring.datamodel.AddressModel;

public class AddressVO  {

	/**
	 * 
	 */

	/*private int doorNo;
	
	private String Street;
	
	private String city;
	
	private int pin;

	@Override
	public String toString() {
		return "AddressVO [doorNo=" + doorNo + ", Street=" + Street + ", city=" + city + ", pin=" + pin + "]";
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	*/
private int addressId;

private String address;

private Integer doorNo;
 
//private PersonVO personvo;




public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getAddressId() {
	return addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public Integer getDoorNo() {
	return doorNo;
}

public void setDoorNo(Integer doorNo) {
	this.doorNo = doorNo;
}
/*
public PersonVO getPersonvo() {
	return personvo;
}

public void setPersonvo(PersonVO personvo) {
	this.personvo = personvo;
}
*/
@Override
public String toString() {
	return "AddressVO [addressId=" + addressId + ", address=" + address + ", doorNo=" + doorNo + "]";
}
	
	
}
