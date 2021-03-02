package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import tech.getarrays.employeemanager.model.Employee;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Modifying
    @Transactional
  void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
