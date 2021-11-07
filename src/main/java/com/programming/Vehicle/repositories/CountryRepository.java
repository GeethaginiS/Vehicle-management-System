package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.Country;

import org.springframework.stereotype.Repository;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
