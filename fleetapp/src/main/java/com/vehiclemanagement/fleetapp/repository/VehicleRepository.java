package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
