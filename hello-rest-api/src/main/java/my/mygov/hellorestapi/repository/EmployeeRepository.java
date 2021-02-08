package my.mygov.hellorestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.mygov.hellorestapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
