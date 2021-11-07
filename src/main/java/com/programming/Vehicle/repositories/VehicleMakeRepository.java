package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.VehicleMake;

import org.springframework.stereotype.Repository;
@Repository

public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
