package com.emp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	//Dummy Employee list 
	
	List<Employee> list = List.of(
			new Employee(1311L,"Peter Parker","65478654"),
			new Employee(1312L,"Peter Parker","65478654"),
			new Employee(1313L,"Peter Parker","65478654"),
			new Employee(1314L,"Peter Parker","65478654"),
			new Employee(1315L,"Peter Parker","65478654"),
			new Employee(1316L,"Peter Parker","65478654"),
			new Employee(1317L,"Peter Parker","65478654"),
			new Employee(1318L,"Peter Parker","65478654"),
			new Employee(1319L,"Peter Parker","65478654")
			
			);

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
