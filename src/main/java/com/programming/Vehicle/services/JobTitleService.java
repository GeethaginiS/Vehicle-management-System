package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.JobTitle;
import com.programming.Vehicle.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	
//Return list of jobTitles
public List<JobTitle> getJobTitles(){
	return jobTitleRepository.findAll();
}
// save new jobTitles
public void save(JobTitle jobTitle) {
	jobTitleRepository.save(jobTitle);
}

// get by id
public Optional<JobTitle> findById(int id) {
	return jobTitleRepository.findById(id);
}
public void delete(Integer id) {
	 jobTitleRepository.deleteById(id);

}
}
