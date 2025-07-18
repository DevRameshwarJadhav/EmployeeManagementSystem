package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Flight;
import com.tech.service.FlightService;

@RestController
@RequestMapping("/flightcontroller")
public class FlightController {

    @Autowired
    FlightService service;

    // Save a flight
    @PostMapping("/save")
    public ResponseEntity<String> flightid(@RequestBody Flight flight) {
        String addflight = service.addflight(flight);
        return new ResponseEntity<>(addflight, HttpStatus.CREATED);
    }

    // Delete a flight by ID
    @DeleteMapping("/deleteflight/{fId}")
    public ResponseEntity<String> deleteflight(@PathVariable String fId) {
        String deleteFlight = service.deleteFlight(fId);

        if (deleteFlight.equals("Flight Deleted Successfully")) {
            return new ResponseEntity<>(deleteFlight, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(deleteFlight, HttpStatus.NOT_FOUND);
        }
    }

    // Get flight info by ID
    @GetMapping("/getflightinfo/{fId}")
    public ResponseEntity<Flight> getFlightInfo(@PathVariable String fId) {
        Flight flight = service.getFlightInfo(fId);

        if (flight != null) {
            return new ResponseEntity<>(flight, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get flight departure and arrival times
    @GetMapping("/getflighttime/{fId}")
    public ResponseEntity<String> getFlightTime(@PathVariable String fId) {
        String flightTimes = service.getFlightTimes(fId);
        if (flightTimes != null) {
            return new ResponseEntity<>(flightTimes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get flight source and destination
    @GetMapping("/getflightlocation/{fId}")
    public ResponseEntity<String> getFlightLocation(@PathVariable String fId) {
        String flightLocation = service.getFlightLocation(fId);
        if (flightLocation != null) {
            return new ResponseEntity<>(flightLocation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
