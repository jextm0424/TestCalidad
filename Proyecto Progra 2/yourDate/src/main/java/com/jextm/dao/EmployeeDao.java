package com.jextm.dao;

import java.util.List;

import com.jextm.model.Employee;

public interface EmployeeDao {
	Employee findById(int id);

	void saveEmployee(Employee employee);

	void deleteEmployeeBySsn(String ssn);

	List<Employee> findAllEmployees();

	Employee findEmployeeBySsn(String ssn);
}
