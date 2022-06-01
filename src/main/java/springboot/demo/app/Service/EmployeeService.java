package springboot.demo.app.Service;

import java.util.List;

import springboot.demo.app.Model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployeeByID(long id);
    void deleteEmployeeByID(long id);
}
