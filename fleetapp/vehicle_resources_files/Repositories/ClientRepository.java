package com.kindsonthegenius.fleetms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetms.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
