package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.Vehicle.models.Contact;
import org.springframework.stereotype.Repository;
@Repository

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
