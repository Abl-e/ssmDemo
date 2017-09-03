package demo.service;

import demo.dao.EmployeeMapper;
import demo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 唐国翔 on 2017/9/1 0001.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Employee> getAll(){
        return employeeMapper.getEmps();
    }
}
