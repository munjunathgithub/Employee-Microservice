package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emp.Entity.Employee;
import com.emp.Service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private RestTemplate restTemplete;
	
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId) {
		Employee employee = this.employeeService.getEmployee(eId);
		
		//http://localhost:9900/record/emp/1312
		List records = this.restTemplete.getForObject("http://localhost:9900/record/emp/1312"+eId,List.class);  
		employee.setRecords(records);	
		return employee;
	}
	
	
}



