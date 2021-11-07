package com.programming.Vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.programming.Vehicle.models.JobTitle;
@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
