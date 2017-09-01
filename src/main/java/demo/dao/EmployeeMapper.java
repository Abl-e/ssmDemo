package demo.dao;


import demo.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
	
	Employee getEmpById(Integer id);
	
	List<Employee> getEmps();
	

}
