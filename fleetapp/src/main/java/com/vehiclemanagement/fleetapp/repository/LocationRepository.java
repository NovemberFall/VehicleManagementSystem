package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
