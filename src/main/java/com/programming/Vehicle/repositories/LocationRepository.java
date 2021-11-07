package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.Location;
@Repository

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
