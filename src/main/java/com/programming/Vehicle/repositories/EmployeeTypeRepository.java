package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.EmployeeType;

import org.springframework.stereotype.Repository;
@Repository

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
