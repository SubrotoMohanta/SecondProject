package com.project.RestSpring.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.RestSpring.VO.PersonVO;
import com.project.RestSpring.datamodel.EmployeeModel;
import com.project.RestSpring.service.EmployeeService;;



@RestController
public class ContactController {

	@Autowired
	EmployeeService empservice;

	private final static Logger logger = Logger.getLogger(ContactController.class);
	@RequestMapping(value = "/")
	public String printWelcome(HttpServletRequest req) {
		System.out.println("Coming Control to HelloController class");

		System.out.println("return control to SUCCESS");
		return "Home";

	}

	@RequestMapping(value = "/addid", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public @ResponseBody Object addid(@RequestBody EmployeeModel emp) {
		System.out.println("control coming to addContacts ID");
		System.out.println("id : " +emp.getEid());
		empservice.saveEmployee(emp);
		logger.info("ContactController log Service Request ID: "+emp.getEid());
		return emp;
	}

	@RequestMapping(value = "/addname", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public @ResponseBody Object addname(@RequestBody EmployeeModel emp) {
		System.out.println("control coming to addContacts NAME");
		System.out.println("id : " +emp.getEname());
		logger.info("ContactController log Service Request Name: "+emp.getEname());
		return emp;
	}
	
	
	@RequestMapping(value = "/addperson", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public @ResponseBody Object addperson(@RequestBody HashMap<String, Object> map) throws JsonProcessingException {
		System.out.println("control coming to addContacts NAME");
		//System.out.println("id : " +emp.getPname());
		empservice.savePerson(map);
		return map;
	}

	
	@RequestMapping(value = "/addpersonVO", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public @ResponseBody Object addpersonVO(@RequestBody HashMap<String, Object> map) throws IOException {
		System.out.println("control coming to addContacts NAME");
		//System.out.println("id : " +emp.getPname());
		ObjectMapper mapper = new ObjectMapper ();
		PersonVO personVO = (PersonVO) mapper.readValue ( mapper.writeValueAsString ( map.get ( "PersonVO" ) ).getBytes (), PersonVO.class );
    	System.out.println("personVO###"+personVO);
		
		
		empservice.savePersonVO(personVO);
		return map;
	}
	
	
	
	
	

	@RequestMapping(value = "/testEmp",method=RequestMethod.POST , consumes = "application/json", produces = "application/json")
	public @ResponseBody Object addall(@RequestBody EmployeeModel emp) {
		//Employee emp=new Employee();
		try {
			File file = new File("D:/filename.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("id : " +emp.getEid()+ "\t");
			bw.write("name : " + emp.getEname() + "\t");
			bw.write("email : " + emp.getEmail() + "\t");
			bw.write("mobile : " +emp.getPhone()+ "\t");
			bw.write("address : " +emp.getAddress() + "\t");
			bw.write("age   : "+emp.getAge()+"\t");
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		empservice.saveEmployee(emp);
		logger.info("ContactController log Service Request: "+emp.getEid());
		logger.info("ContactController log Service Request: "+emp.getEname());
		logger.info("ContactController log Service Request: "+emp.getEmail());
		logger.info("ContactController log Service Request: "+emp.getPhone());
		logger.info("ContactController log Service Request: "+emp.getAddress());
		logger.info("ContactController log Service Request: "+emp.getAge());
		
		return emp;
	}

}
///http://localhost:8028/RestSpringProject/addpersonVO
/*{
	"PersonVO":{
	"pname":"YUDR",
	"email":"yu@gmail",
	"age":"45",
	"phone":"9885750652",
	"addressVO":{
	"address":"andhra"
	}
	}
	
}*/




/*
 * PostMan request
 * 
 * http://localhost:8028/RestSpringProject/testEmp
{
"id":25,
"name": "yuva",
"email": "yuva@gmail.com",
"mobile": "33669655",
"address": "Andhra pradeesh"
}

*/
/*
{
http://localhost:8028/RestSpringProject/addid
db worked
	"eid":34,
	"ename":"yuva",
	"email":"yuva@gmail.com",
	"age":25,
	"phone":"56632116545",
	"address":"mumbai"

}

*/
/*
http://localhost:8028/RestSpringProject/addpersonVO

{
	"PersonVO":{
	"pname":"MyMy",
	"email":"MyMy@gmail",
	"age":"44",
	"phone":"998562365",
	"bykevo":{
		"bkName":"KTM",
		"bkCC":"400"
	},
	"addressVOList":[
		{
			"doorNo":18,
			"address":"Amaravathi"
		},
		{
			"doorNo":28,
			"address":"Bangalore"
		}
		
	]
  }
	
}


*/