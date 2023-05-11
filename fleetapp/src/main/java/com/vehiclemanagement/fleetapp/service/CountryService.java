package com.vehiclemanagement.fleetapp.service;

import com.vehiclemanagement.fleetapp.model.Country;
import com.vehiclemanagement.fleetapp.repository.CountryRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	//Get All Countrys
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}

	//Save new country
	public void save(Country country) {
		countryRepository.save(country);
	}


//	//Get All Countrys
//	public List<Country> findAll(){
//		return countryRepository.findAll();
//	}
//
//	//Get Country By Id
//	public Optional<Country> findById(int id) {
//		return countryRepository.findById(id);
//	}
//
//	//Delete Country
//	public void delete(int id) {
//		countryRepository.deleteById(id);
//	}
//
//	//Update Country
//	public void save( Country country) {
//		countryRepository.save(country);
//	}

}
