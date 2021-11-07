package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.Invoice;

import org.springframework.stereotype.Repository;
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
