package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
