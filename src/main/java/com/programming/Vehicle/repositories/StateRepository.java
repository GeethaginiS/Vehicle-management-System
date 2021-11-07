package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.State;
@Repository

public interface StateRepository extends JpaRepository<State, Integer> {

}
