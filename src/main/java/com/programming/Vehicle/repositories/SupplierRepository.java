package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
