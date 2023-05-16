package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
