package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
