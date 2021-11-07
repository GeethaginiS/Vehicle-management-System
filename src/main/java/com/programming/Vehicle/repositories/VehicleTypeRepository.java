package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.VehicleType;

import org.springframework.stereotype.Repository;
@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
