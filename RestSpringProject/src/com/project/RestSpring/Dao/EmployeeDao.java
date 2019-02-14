package com.project.RestSpring.Dao;

import java.util.List;

import com.project.RestSpring.datamodel.BankModel;
import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.datamodel.PersonModel;



public interface EmployeeDao {

boolean saveEmployee(EmployeeModel employee);
   
boolean SaveObj(Object obj);

List<EmployeeModel> findAllEmployees();

//boolean saveBank(BankModel bankmodel);
    
    
    
	
}
