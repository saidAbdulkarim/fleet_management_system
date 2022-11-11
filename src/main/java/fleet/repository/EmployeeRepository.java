package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
