package it.asystel.flightreservation.entities;

import java.sql.Timestamp;
import java.util.Date;

public class Flight {
    private Long id;
    private String flightNumber;
    private String operatingAirlines;
    private String departueCity;
    private String arrivalCity;
    private Date dateOfDepartue;
    private Timestamp estimatedDepartureTime;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartueCity() {
        return departueCity;
    }

    public void setDepartueCity(String departueCity) {
        this.departueCity = departueCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDateOfDepartue() {
        return dateOfDepartue;
    }

    public void setDateOfDepartue(Date dateOfDepartue) {
        this.dateOfDepartue = dateOfDepartue;
    }

    public Timestamp getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }
}
