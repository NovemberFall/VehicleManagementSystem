package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
