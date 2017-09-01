package demo.dao;


import demo.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	

}
