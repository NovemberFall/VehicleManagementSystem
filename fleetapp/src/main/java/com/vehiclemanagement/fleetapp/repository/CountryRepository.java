package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
