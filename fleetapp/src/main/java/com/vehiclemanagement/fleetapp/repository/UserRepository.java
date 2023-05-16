package com.vehiclemanagement.fleetapp.repository;

import com.vehiclemanagement.fleetapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
