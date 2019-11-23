package com.company.t4.entity;

import java.util.List;
import java.util.Objects;

public class Airport {
    List<Airline>  airlines;

    public Airport(List<Airline> airlines){
        this.airlines = airlines;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airlines, airport.airlines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlines);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airlines=" + airlines +
                '}';
    }
}
