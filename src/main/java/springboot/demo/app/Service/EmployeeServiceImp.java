package springboot.demo.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.demo.app.Model.Employee;
import springboot.demo.app.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        // TODO Auto-generated method stub
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeByID(long id) {
        // TODO Auto-generated method stub
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent()){
            employee=optional.get();
        }else{
            throw new RuntimeException("Employee not found for id ::" +id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeByID(long id) {
        // TODO Auto-generated method stub
        this.employeeRepository.deleteById(id);
    }
    
}
