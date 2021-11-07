package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.VehicleMovement;
@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
