package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.VehicleHire;
@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
