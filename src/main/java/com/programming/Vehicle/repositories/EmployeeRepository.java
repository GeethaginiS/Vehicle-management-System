package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.Employee;

import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByUsername(String un);

}
