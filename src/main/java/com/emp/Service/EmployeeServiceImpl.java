package com.emp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	//Dummy Employee list 
	
	List<Employee> list = List.of(
			new Employee(1311L,"Peter Parker","65478654"),
			new Employee(1312L,"Peter Par","79664879876"),
			new Employee(1313L,"Peter k","8659766676"),
			new Employee(1314L,"dab dell","374854825"),
			new Employee(1315L,"man tenan","3485839384"),
			new Employee(1316L,"jan jhon","83748564838"),
			new Employee(1317L,"San Parker","837455840"),
			new Employee(1318L,"tom Parker","937475854"),
			new Employee(1319L,"bob Parker","93845857484")
			
			);

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
