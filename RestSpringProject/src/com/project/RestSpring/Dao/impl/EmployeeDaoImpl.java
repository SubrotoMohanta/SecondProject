package com.project.RestSpring.Dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.project.RestSpring.Dao.EmployeeDao;
import com.project.RestSpring.datamodel.BankModel;
import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.datamodel.PersonModel;

@Repository
@Transactional 
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	HibernateTemplate htemp;
	
	    /*@Autowired
	    private SessionFactory sessionFactory;
	 
	    public EmployeeDaoImpl() {
	         
	    }
	     
	    public EmployeeDaoImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }

	    @Override
	    @Transactional
	    public void saveEmployee(Employee employee) {
	    	System.out.println("Employe Dao control coming");
			EmployeeModel empmodel=new EmployeeModel();
		    empmodel.setEid(employee.getEid());
		    empmodel.setEname(employee.getEname());
			empmodel.setEmail(employee.getEmail());
			empmodel.setAge(employee.getAge());
			empmodel.setPhone(employee.getPhone());
			empmodel.setAddress(employee.getAddress());
	        sessionFactory.getCurrentSession().saveOrUpdate(empmodel);
	    }
	*/
	public boolean saveEmployee(EmployeeModel employee) {
		System.out.println("Employe Dao control coming");
		htemp.saveOrUpdate(employee);
		return true;
		

	}

	@Override
	public List<EmployeeModel> findAllEmployees() {
		System.out.println("EmployeeDAOImpl-getuser()");
		List<EmployeeModel> emplist=new ArrayList<EmployeeModel>();
		String hql="from EmployeeModel em ";
		List<EmployeeModel> list=(List<EmployeeModel>) htemp.find(hql);	
		System.out.println("**EmployeeImpl ListSize**"+list.size());
		for(EmployeeModel em:list){
			EmployeeModel emp=new EmployeeModel();     
			emp.setEid(em.getEid());
			emp.setEname(em.getEname());
			emp.setEmail(em.getEmail());
			emp.setAge(em.getAge());
			emp.setPhone(em.getPhone());
			emp.setAddress(em.getAddress());
			emplist.add(emp);
		}
		return  emplist;
	}

	/*@Override
	public boolean savePerson(PersonModel person) {
		System.out.println("person Dao control coming");
		htemp.saveOrUpdate(person);
		return true;
	}

	@Override
	public boolean saveBank(BankModel bankmodel) {
		System.out.println("bank Dao Controll coming");
		htemp.saveOrUpdate(bankmodel);
		return true;
	}*/

	public boolean SaveObj(Object obj){
		System.out.println("Object Controll coming");
		htemp.saveOrUpdate(obj);
		return true;
		
	}
}
