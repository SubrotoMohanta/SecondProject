package com.project.RestSpring.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.RestSpring.Dao.EmployeeDao;
import com.project.RestSpring.Util.ConvertVoToBean;
import com.project.RestSpring.VO.PersonVO;
import com.project.RestSpring.datamodel.AddressModel;
import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.datamodel.PersonModel;
import com.project.RestSpring.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao empdao;
	
	@Override
	public boolean saveEmployee(EmployeeModel employee) {
		System.out.println("coming control to service layer employeeSave");
	return	empdao.saveEmployee(employee);
		
	}

	@Override
	public List<EmployeeModel> findAllEmployees() {
		System.out.println("coming control to service layer findAllEmployees");	
		return empdao.findAllEmployees();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean savePerson(HashMap<String, Object> map) {
		/*AddressModel addressModel=new AddressModel();
		String adrs=(String) map.get("address");
		addressModel.setAddress(adrs);
		List<AddressModel> listAddress=new ArrayList<>();
		addressModel.setPerson(employee);
		listAddress.add(addressModel);
		employee.setAddressList(listAddress);
		return empdao.savePerson(employee);*/
		String name=(String) map.get("pname");
		String address=(String) map.get("address");
		String address1=(String) map.get("address1");
		String age=(String) map.get("age");
		String phone=(String) map.get("phone");
		String email=(String) map.get("email");
			
		PersonModel personModel=new PersonModel();
		personModel.setAge(Integer.parseInt(age));
		personModel.setEmail(email);
		personModel.setPname(name);
		personModel.setPhone(phone);
		
		
		AddressModel addressModel=new AddressModel();
		addressModel.setAddress(address);
		addressModel.setPerson(personModel);
		
		AddressModel addressModel1=new AddressModel();
		addressModel1.setAddress(address1);
		addressModel1.setPerson(personModel);
		
		List<AddressModel> list=new ArrayList<>();
		list.add(addressModel);
		list.add(addressModel1);
		//personModel.setAddressList(list);
		return empdao.savePerson(personModel);
	}

	@Override
	public boolean savePersonVO(PersonVO personVO) {
		PersonModel personModel=ConvertVoToBean.setVoToBean(personVO);
		return empdao.savePerson(personModel);
	}
}
