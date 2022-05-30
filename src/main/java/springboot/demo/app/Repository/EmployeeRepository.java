package springboot.demo.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.demo.app.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
