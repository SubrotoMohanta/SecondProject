package com.project.RestSpring.Util;

import java.util.ArrayList;
import java.util.List;

import com.project.RestSpring.VO.AddressVO;
import com.project.RestSpring.VO.BankVO;
import com.project.RestSpring.VO.PersonVO;
import com.project.RestSpring.datamodel.AddressModel;
import com.project.RestSpring.datamodel.BankModel;
import com.project.RestSpring.datamodel.BykeModel;
import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.datamodel.PersonModel;

public class ConvertVoToBean {
	public static PersonModel setPersonVoToBean(PersonVO personvo) {
		
		PersonModel personBean=new PersonModel();
		personBean.setPname(personvo.getPname());
		personBean.setEmail(personvo.getEmail());
		personBean.setAge(Integer.parseInt(personvo.getAge()));
		personBean.setPhone(personvo.getPhone());
		BykeModel bykemdl = new BykeModel();
		bykemdl.setBkCC(personvo.getBykevo().getBkCC());
		bykemdl.setBkName(personvo.getBykevo().getBkName());
		bykemdl.setBkperson(personBean);
		personBean.setByke(bykemdl);
		List<AddressModel> list=new ArrayList<>();
		for(AddressVO addressVO : personvo.getAddressVOList()){
			AddressModel addressModel=new AddressModel();
			addressModel.setAddress(addressVO.getAddress());
			addressModel.setDoorNo(addressVO.getDoorNo());
			addressModel.setPerson(personBean);
			list.add(addressModel);
		}
		personBean.setAddressList(list);
		
		//addressModel.setPerson(personBean);
		
		
		
		//personBean.setAddressList(list);
		
		//EmployeeModel empMdl=new EmployeeModel();
		//empMdl.setAge(personvo.getEmpvo().getAge());
		//empMdl.setEname(personvo.getEmpvo().getEname());
		//empMdl.setPhone(personvo.getEmpvo().getPhone());
		//empMdl.setEmail(personvo.getEmpvo().getEmail());
		//personBean.setEmpMdl(empMdl);
		//empMdl.setPrsn(personBean);
		
		return personBean;
	}
	
	public static BankModel setBankVOToBankBean(BankVO bankvo){
		BankModel bankmodel=new BankModel();
		bankmodel.setAccName(bankvo.getAccName());
		bankmodel.setAccType(bankvo.getAccType());	
		bankmodel.setBankName(bankvo.getBankName());
		List<PersonModel> pesonlist= new ArrayList<>();
		for(PersonVO personvo:bankvo.getPersonvo()){
			PersonModel personBean=new PersonModel();
			personBean.setPname(personvo.getPname());
			personBean.setEmail(personvo.getEmail());
			personBean.setAge(Integer.parseInt(personvo.getAge()));
			personBean.setPhone(personvo.getPhone());
			EmployeeModel emp=new EmployeeModel();
			emp.setAddress(personvo.getEmpvo().getAddress());
			emp.setAge(personvo.getEmpvo().getAge());
			emp.setEmail(personvo.getEmpvo().getEmail());
			emp.setEname(personvo.getEmpvo().getEname());
			emp.setPhone(personvo.getEmpvo().getPhone());
			emp.setPrsn(personBean);
			personBean.setEmpMdl(emp);
			BykeModel bykemdl = new BykeModel();
			bykemdl.setBkCC(personvo.getBykevo().getBkCC());
			bykemdl.setBkName(personvo.getBykevo().getBkName());
			bykemdl.setBkperson(personBean);
			personBean.setByke(bykemdl);
			List<AddressModel> list=new ArrayList<>();
			for(AddressVO addressVO : personvo.getAddressVOList()){
				AddressModel addressModel=new AddressModel();
				addressModel.setAddress(addressVO.getAddress());
				addressModel.setDoorNo(addressVO.getDoorNo());
				addressModel.setPerson(personBean);
				list.add(addressModel);
			}
			personBean.setAddressList(list);
			personBean.setBankmdl(bankmodel);
			pesonlist.add(personBean);
		}
		bankmodel.setPersonModel(pesonlist);
		return bankmodel;	
	}
}
