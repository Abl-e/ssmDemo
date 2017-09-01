package demo.controller;

import demo.domain.Employee;
import demo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 唐国翔 on 2017/9/1 0001.
 */
@Controller
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/getEmps")
    public String emps(Map<String,Object> map){
        List<Employee> employees = employeeService.getAll();
        map.put("emps",employees);
        return "list";
    }
}
