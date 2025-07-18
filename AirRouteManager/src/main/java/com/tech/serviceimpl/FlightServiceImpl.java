package com.tech.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Flight;
import com.tech.repository.FlightRepo;
import com.tech.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepo repo;

    @Override
    public String addflight(Flight flight) {
        if (repo.existsById(flight.getFlightId())) {
            return "Flight ID " + flight.getFlightId() + " already exists!";
        }
        repo.save(flight);
        return "Flight ID " + flight.getFlightId() + " saved successfully!";
    }

    @Override
    public String deleteFlight(String fId) {
        Optional<Flight> findById = repo.findById(fId);
        if (findById.isPresent()) {
            repo.deleteById(fId);
            return "Flight Deleted Successfully";
        } else {
            return "Flight not present";
        }
    }

    // Get complete flight info by ID
    @Override
    public Flight getFlightInfo(String fId) {
        Optional<Flight> flight = repo.findById(fId);
        return flight.orElse(null); 
    }

    // Get flight times (departure and arrival) by ID
    @Override
    public String getFlightTimes(String fId) {
        Optional<Flight> flight = repo.findById(fId);
        if (flight.isPresent()) {
            Flight f = flight.get();
            return "Departure: " + f.getFlightDepartureTime() + ", Arrival: " + f.getFlightArrivalTime();
        }
        return null;
    }

    // Get source and destination by flight ID
    @Override
    public String getFlightLocation(String fId) {
        Optional<Flight> flight = repo.findById(fId);
        if (flight.isPresent()) {
            Flight f = flight.get();
            return "Source: " + f.getFlightSource() + ", Destination: " + f.getFlightDestination();
        }
        return null;
    }
}
