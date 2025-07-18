package com.tech.repository;

import org.springframework.data.repository.CrudRepository;

import com.tech.entity.Flight;

public interface FlightRepo extends CrudRepository<Flight, String> {

}
