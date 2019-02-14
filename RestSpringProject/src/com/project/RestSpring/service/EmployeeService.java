package com.project.RestSpring.service;

import java.util.HashMap;
import java.util.List;

import com.project.RestSpring.VO.BankVO;
import com.project.RestSpring.VO.PersonVO;
import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.datamodel.PersonModel;

public interface EmployeeService {

boolean saveEmployee(EmployeeModel employee);

boolean savePerson(HashMap<String, Object> map);

boolean savePersonVO(PersonVO personVO);

boolean saveBankVO(BankVO bankVO);
    
List<EmployeeModel> findAllEmployees();
	
}
