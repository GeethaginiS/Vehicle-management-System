package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
