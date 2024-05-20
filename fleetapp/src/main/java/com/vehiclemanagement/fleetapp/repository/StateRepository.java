package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
