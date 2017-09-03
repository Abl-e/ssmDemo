import com.alibaba.druid.support.spring.stat.SpringStatUtils;
import demo.domain.Employee;
import demo.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by 唐国翔 on 2017/9/1.
 */
public class TestDataSource {
    @Test
    public void test(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        List<Employee> employees = employeeService.getAll();

        System.out.println(employees);
        System.out.println(dataSource);
    }
}
