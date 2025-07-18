package com.tech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Flight {
	


	@Id
	private String flightId;
	
	private String flightCompany;
	
	private String flightDepartureDate;
	
	private String flightDepartureTime;
	
	private String flightArrivalTime;
	
	private String flightSource;
	
	private String flightDestination;
	
	private String flightDuration;
	
	private double flightFare;
	
	
	
	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightCompany() {
		return flightCompany;
	}

	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}

	
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}

	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}

	public String getFlightDepartureTime() {
		return flightDepartureTime;
	}

	public void setFlightDepartureTime(String flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}

	public String getFlightArrivalTime() {
		return flightArrivalTime;
	}

	public void setFlightArrivalTime(String flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public String getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}

	public double getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(double flightFare) {
		this.flightFare = flightFare;
	}
	

}
