package com.tech.service;

import com.tech.entity.Flight;

public interface FlightService {

    String addflight(Flight flight);// Add flight to database

    String deleteFlight(String fId);// Delete Flight from database

    Flight getFlightInfo(String fId); // Get flight info

    String getFlightTimes(String fId); // Get departure and arrival times

    String getFlightLocation(String fId); // Get source and destination
}
