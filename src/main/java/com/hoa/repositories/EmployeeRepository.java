/*
 * Java domain class for entity "Employee" 
 * Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package com.hoa.repositories;
import com.hoa.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * <h2>EmployeeRepository</h2>
 *
 * createdAt : 2024-04-22 - Time 21:42:03
 * <p>
 * Description: Spring Data repository for the {@link Employee} entity.
 * 
 * @author aek
 */
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> , JpaSpecificationExecutor<Employee> {

	Employee findEmployeeByUserId(Integer userId);
}
