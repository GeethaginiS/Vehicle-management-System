package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.VehicleStatus;
@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
