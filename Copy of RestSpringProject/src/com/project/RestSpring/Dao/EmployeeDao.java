package com.project.RestSpring.Dao;

import java.util.List;

import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.datamodel.PersonModel;



public interface EmployeeDao {

boolean saveEmployee(EmployeeModel employee);
   
boolean savePerson(PersonModel employee);

List<EmployeeModel> findAllEmployees();
    
    
    
	
}
